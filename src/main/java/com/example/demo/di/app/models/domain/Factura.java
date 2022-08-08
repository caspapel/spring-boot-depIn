package com.example.demo.di.app.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Factura {

	private String descripcion;
	@Autowired
	private Cliente cliente;
    @Autowired
    @Qualifier("ItemsFactura2")
	private List<ItemFactura> items;
    
    @PostConstruct
    public void init() {
    	cliente.setNombre(cliente.getNombre().concat(" ".concat(" Otro nombre ")));
    }

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}
