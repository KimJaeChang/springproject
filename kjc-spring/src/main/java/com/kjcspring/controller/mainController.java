package com.kjcspring.controller;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.apache.ibatis.mapping.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.kjcspring.dao.*;
import com.kjcspring.model.KjcVO;

@Controller
public class mainController {
	
	@Autowired
	private KjcDAO kjcDAO;
	
	private static final Logger logger = LoggerFactory.getLogger(mainController.class);
	
	@GetMapping("/")
	public String login(Model model) {
		
		model.addAttribute("data", "안녕~");
		return "login";
	}
	
	@GetMapping("/home")
	public String home() {
		
		List<KjcVO> kjcList = kjcDAO.selectkjcList();
		
		System.out.println("kjcList : " + kjcList.toString());
		return "home";
	}
	
}
