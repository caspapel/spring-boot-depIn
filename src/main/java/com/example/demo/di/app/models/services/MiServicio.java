package com.example.demo.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service ("MiServicio")
@Primary
public class MiServicio implements IServicio {
	
	@Override
	public String operacion() {
		return "Ejemplo factura con DI";
	}

}
