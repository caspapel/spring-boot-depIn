package com.example.demo.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.di.app.models.domain.Factura;
import com.example.demo.di.app.models.services.IServicio;

@Controller
@RequestMapping("/factura")
public class FacturaController {
	@Autowired
	@Qualifier("MiServicio")
	private IServicio servicio;
	@Autowired
	private Factura factura;
	
	@GetMapping("/ver")
	public String ver(Model model) {
		model.addAttribute("titulo", servicio.operacion());
		model.addAttribute("factura", factura);
		return "factura/ver";
	} 

}
