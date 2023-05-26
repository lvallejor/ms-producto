package com.cursoudemy.springboot.app.productos.models.service;

import java.util.List;

import com.cursoudemy.springboot.app.productos.models.entity.Producto;

public interface IProductosService {


	public List<Producto> findAll();
	public Producto finById(Long id);
}
