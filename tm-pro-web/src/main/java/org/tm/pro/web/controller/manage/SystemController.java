package org.tm.pro.web.controller.manage;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("system")
public class SystemController  {

	public SystemController() {
	}

	@RequestMapping(value = "/quartz", method = { RequestMethod.GET })
	public ModelAndView quartz(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("system/quartz");
		return mav;
	}
}
