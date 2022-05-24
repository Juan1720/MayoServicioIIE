package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Productos;

public interface ProductoService {

	void guardarProducto(Productos productos);
	void actualizarProducto(Productos productos);
	void eliminarProducto(Integer id);
	List<Productos> listarProducto();
	Productos obtenerProductoId(Integer id);
}
