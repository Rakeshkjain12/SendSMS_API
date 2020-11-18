package com.rakesh.sendsms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rakesh.sendsms.model.SMS;
import com.rakesh.sendsms.service.SmsSenderService;



@Controller
public class PageController {

	@Autowired
	private SmsSenderService smsSenderService;
    	
	
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Send Message");
		mv.addObject("sms",new SMS());
		return mv;
	}
	
	@RequestMapping(value= "/send")
	public ModelAndView sendSMS(@ModelAttribute("sms") SMS sms) {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Send Message");
		mv.addObject("sms",new SMS());
		smsSenderService.sendSms(sms);
		return mv;
	}
}
