package com.example.demo.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.di.app.models.services.IServicio;

@Controller
public class IndexController {
	@Autowired
	@Qualifier("MiServicio")
	private IServicio servicio;
	
	@GetMapping({"/index","", "/"})
	public String index(Model model) {
		model.addAttribute("dato", servicio.operacion());
		return "index";
	}

}
