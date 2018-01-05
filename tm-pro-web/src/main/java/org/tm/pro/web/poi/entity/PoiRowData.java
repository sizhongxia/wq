package org.tm.pro.web.poi.entity;

import java.io.Serializable;
import java.util.Date;

import org.jeecgframework.poi.excel.annotation.Excel;

public class PoiRowData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Excel(name = "采集时间", databaseFormat = "yyyy-MM-dd HH:mm:ss", format = "yyyy-MM-dd HH:mm:ss", isImportField = "true_st", height = 10, width = 20)
	private Date ts;
	@Excel(name = "设备Mac", height = 10, width = 20, isImportField = "true_st")
	private String dmac;
	@Excel(name = "采集值", height = 10, width = 10, isImportField = "true_st")
	private int rssi;

	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}

	public String getDmac() {
		return dmac;
	}

	public void setDmac(String dmac) {
		this.dmac = dmac;
	}

	public int getRssi() {
		return rssi;
	}

	public void setRssi(int rssi) {
		this.rssi = rssi;
	}
}
