package org.tm.pro.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.tm.pro.web.anno.UserAgentRecord;

@Controller
public class IndexController {
	
	public IndexController() {
	}

	@UserAgentRecord
	@RequestMapping(value = { "/index" }, method = { RequestMethod.GET })
	public ModelAndView index(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	/***
	 * 后台主页面
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/welcome")
	public ModelAndView welcome(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("welcome");
		return mav;
	}

	/***
	 * 导出页面
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/export")
	public ModelAndView export(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("export");
		return mav;
	}

	/***
	 * 不兼容提示
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/ie")
	public ModelAndView ie(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("ie");
		return mav;
	}

	@RequestMapping(value = "/page_not_found")
	public ModelAndView pageNotFound(HttpServletRequest request) {
		ModelAndView view = new ModelAndView();
		if (request.getHeader("Referer") != null) {
			view.setViewName("page_not_found");
		} else {
			view.setViewName("to_skip_index");
		}
		return view;
	}

	@RequestMapping(value = "/server_busy")
	public ModelAndView serverBusy(HttpServletRequest request) {
		ModelAndView view = new ModelAndView("server_busy");
		return view;
	}
	
}
