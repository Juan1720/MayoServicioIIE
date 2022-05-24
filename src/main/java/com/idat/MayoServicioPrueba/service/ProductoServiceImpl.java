package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.Repository.ProductoRepository;
import com.idat.MayoServicioPrueba.model.Productos;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository repository;

	@Override
	public void guardarProducto(Productos productos) {
		repository.guardarProducto(productos);
		
	}

	@Override
	public void actualizarProducto(Productos productos) {
		// TODO Auto-generated method stub
		repository.actualizarProducto(productos);
	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.eliminarProducto(id);

	}

	@Override
	public List<Productos> listarProducto() {
		// TODO Auto-generated method stub
		return repository.listarProducto();
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
		return repository.obtenerProductoId(id);
	}

}
