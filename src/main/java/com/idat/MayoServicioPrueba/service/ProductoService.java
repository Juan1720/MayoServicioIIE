package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.dto.ProductoDTORequest;
import com.idat.MayoServicioPrueba.dto.ProductoDTOResponse;

public interface ProductoService {

	void guardarProducto(ProductoDTORequest productos);
	void actualizarProducto(ProductoDTORequest productos);
	void eliminarProducto(Integer id);
	List<ProductoDTOResponse> listarProducto();
	ProductoDTOResponse obtenerProductoId(Integer id);
}
