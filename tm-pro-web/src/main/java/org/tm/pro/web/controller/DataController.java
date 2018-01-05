package org.tm.pro.web.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Workbook;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tm.pro.entity.AnalysisData;
import org.tm.pro.entity.RawData;
import org.tm.pro.model.ApiModel;
import org.tm.pro.model.MacData;
import org.tm.pro.service.AnalysisDataService;
import org.tm.pro.service.RawDataService;
import org.tm.pro.utils.TmNumberUtil;
import org.tm.pro.utils.TmStringUtil;
import org.tm.pro.web.poi.entity.PoiRowData;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping(value = { "/data" })
public class DataController {

	@Autowired
	AnalysisDataService analysisDataService;
	@Autowired
	RawDataService rawDataService;

	public DataController() {
	}

	@ResponseBody
	@RequestMapping(value = { "/api" }, method = { RequestMethod.POST }, consumes = { "application/json" })
	public Map<String, Object> api(@RequestBody ApiModel apiModel) {
		Map<String, Object> data = new HashMap<>();
		data.put("code", 1);
		if (apiModel == null) {
			data.put("msg", "No Param");
			return data;
		}
		Integer count = apiModel.getCount();
		if (count == null || count.intValue() < 1) {
			data.put("msg", "No Data");
			return data;
		}

		List<MacData> macData = apiModel.getData();
		if (macData == null || macData.isEmpty()) {
			data.put("msg", "No Real Data");
			return data;
		}
		if (macData.size() != count.intValue()) {
			data.put("msg", "Data error");
			return data;
		}

		RawData rawData = new RawData();
		rawData.setCount(count);
		rawData.setSmac(apiModel.getSmac());
		rawData.setData(JSON.toJSONString(apiModel));
		rawData.setStatus("N");
		rawDataService.save(rawData);

		AnalysisData analysisData = null;
		for (MacData md : macData) {
			analysisData = new AnalysisData();
			analysisData.setSmac(apiModel.getSmac());
			analysisData.setDmac(md.getDmac());
			analysisData.setRssi(md.getRssi());
			analysisData.setTs(md.getTs());
			analysisData.setCt(System.currentTimeMillis());
			analysisDataService.save(analysisData);
		}

		data.put("code", 0);
		data.put("msg", "");
		return data;
	}

	@ResponseBody
	@RequestMapping(value = { "/analysis" })
	public Map<String, Object> analysis(HttpServletRequest request) {
		Map<String, Object> data = new HashMap<>();
		data.put("success", false);

		String smac = request.getParameter("smac");
		String dmac = request.getParameter("dmac");
		String startTime = request.getParameter("startTime");
		String endTime = request.getParameter("endTime");

		String cPage = request.getParameter("page");
		String cSize = request.getParameter("size");
		int page = TmNumberUtil.toInt(cPage, 1);
		int size = TmNumberUtil.toInt(cSize, 50);

		String vsmac = "";
		if (TmStringUtil.isNotBlank(smac)) {
			vsmac = smac;
		}
		String vdmac = "";
		if (TmStringUtil.isNotBlank(dmac)) {
			vdmac = dmac;
		}
		long vstartTime = 0;
		if (TmStringUtil.isNotBlank(startTime)) {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				Date date = df.parse(startTime);
				vstartTime = date.getTime() / 1000;
			} catch (ParseException e) {
			}
		}
		long vendTime = 0;
		if (TmStringUtil.isNotBlank(endTime)) {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				Date date = df.parse(endTime);
				vendTime = date.getTime() / 1000;
			} catch (ParseException e) {
			}
		}

		PageHelper.startPage(page, size);
		List<AnalysisData> analysisDatas = analysisDataService.getAnalysisDatas(vsmac, vdmac, vstartTime, vendTime);

		if (analysisDatas == null || analysisDatas.isEmpty()) {
			return data;
		}

		PageInfo<AnalysisData> pageInfo = new PageInfo<AnalysisData>(analysisDatas);

		long total = pageInfo.getTotal();
		int totalPage = pageInfo.getPages();

		data.put("success", true);
		data.put("data", analysisDatas);
		if (page > totalPage) {
			page = totalPage;
		}
		data.put("page", page);
		data.put("total", total);
		data.put("size", size);
		data.put("totalPage", totalPage);
		return data;
	}

	@RequestMapping("export")
	public void downExcel(HttpServletRequest request, HttpServletResponse response) {

		String smac = request.getParameter("smac");
		String dmac = request.getParameter("dmac");
		String startTime = request.getParameter("startTime");
		String endTime = request.getParameter("endTime");

		String cSize = request.getParameter("size");
		int size = TmNumberUtil.toInt(cSize, 100);
		if(size == 0) {
			size = Integer.MAX_VALUE;
		}

		String vsmac = "";
		if (TmStringUtil.isNotBlank(smac)) {
			vsmac = smac;
		}
		String vdmac = "";
		if (TmStringUtil.isNotBlank(dmac)) {
			vdmac = dmac;
		}
		long vstartTime = 0;
		if (TmStringUtil.isNotBlank(startTime)) {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				Date date = df.parse(startTime);
				vstartTime = date.getTime() / 1000;
			} catch (ParseException e) {
			}
		}
		long vendTime = 0;
		if (TmStringUtil.isNotBlank(endTime)) {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				Date date = df.parse(endTime);
				vendTime = date.getTime() / 1000;
			} catch (ParseException e) {
			}
		}

		PageHelper.startPage(1, size);
		List<AnalysisData> analysisDatas = analysisDataService.getAnalysisDatas(vsmac, vdmac, vstartTime, vendTime);

		if (analysisDatas == null || analysisDatas.isEmpty()) {
			return;
		}

		Collection<PoiRowData> list = new ArrayList<>();
		PoiRowData item = null;
		for (AnalysisData d : analysisDatas) {
			item = new PoiRowData();
			item.setTs(new Date(d.getTs() * 1000));
			item.setDmac(d.getDmac());
			item.setRssi(d.getRssi());
			list.add(item);
		}

		// 指定列表标题 和 工作表名称
		ExportParams params = new ExportParams("设备信号数据采集数据 - " + new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()), "数据");
		Workbook workbook = ExcelExportUtil.exportExcel(params, PoiRowData.class, list);

		response.setHeader("content-Type", "application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment;filename=TzData-" + System.currentTimeMillis() + ".xls");
		response.setCharacterEncoding("UTF-8");

		try {
			workbook.write(response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
