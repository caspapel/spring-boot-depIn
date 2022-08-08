package com.example.demo.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("MiServicioComplejo")
@Primary
public class MiServicioComplejo implements IServicio {
	
	@Override
	public String operacion() {
		return "dato en servicio complejo";
	}

}
