package com.example.demo.di;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.di.app.models.domain.ItemFactura;
import com.example.demo.di.app.models.domain.Producto;

@Configuration
public class AppConfig {
	
	
	@Bean("ItemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("1", 33);
		Producto producto2 = new Producto("2", 55);
		ItemFactura ifactu = new ItemFactura(producto1, 2);
		ItemFactura ifactu2 = new ItemFactura(producto2, 3);
		
		List<ItemFactura> itemsFactura= Arrays.asList(ifactu,ifactu2);
		return itemsFactura;
	}
	
	@Bean("ItemsFactura2")
	public List<ItemFactura> registrarItems2(){
		Producto producto1 = new Producto("producto 1", 3);
		Producto producto2 = new Producto("producto 2", 5);
		Producto producto3 = new Producto("producto 3", 50);
		Producto producto4 = new Producto("producto 4", 28);
		
		ItemFactura ifactu = new ItemFactura(producto1, 20);
		ItemFactura ifactu2 = new ItemFactura(producto2, 39);
		ItemFactura ifactu3 = new ItemFactura(producto3, 2);
		ItemFactura ifactu4 = new ItemFactura(producto4, 99);
		
		List<ItemFactura> itemsFactura= Arrays.asList(ifactu,ifactu2,ifactu3,ifactu4);
		return itemsFactura;
	}

}
