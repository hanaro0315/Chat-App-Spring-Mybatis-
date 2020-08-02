package com.spring.chat;


import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Inject
	private mainService service;

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String hi(mainDTO md, Model model) {
		System.out.println(md.getName()+" "+ md.getText());
		service.insert(md);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String upload(Model model) throws Exception {
		List<mainDTO> list = service.list();
		model.addAttribute("list", list);
		return "main";
	}
	
}
