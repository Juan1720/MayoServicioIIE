package com.idat.MayoServicioPrueba.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.Repository.ProductoRepository;
import com.idat.MayoServicioPrueba.dto.ProductoDTORequest;
import com.idat.MayoServicioPrueba.dto.ProductoDTOResponse;
import com.idat.MayoServicioPrueba.model.Productos;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository repository;

	@Override
	public void guardarProducto(ProductoDTORequest productos) {
		Productos p = new Productos();
		p.setNombreProducto(productos.getNombre());
		p.setDescripcion(p.getDescripcion());
		p.setPrecio(productos.getPrecioProducto());
		p.setStock(productos.getStockProducto());
		repository.save(p);
		
	}

	@Override
	public void actualizarProducto(ProductoDTORequest productos) {
		// TODO Auto-generated method stub
		
		Productos p = new Productos();
		p.setIdProducto(productos.getId());
		p.setNombreProducto(productos.getNombre());
		p.setDescripcion(p.getDescripcion());
		p.setPrecio(productos.getPrecioProducto());
		p.setStock(productos.getStockProducto());
		
		repository.saveAndFlush(p);
	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public List<ProductoDTOResponse> listarProducto() {
		// TODO Auto-generated method stub
		List<ProductoDTOResponse> listar  = new ArrayList<>();
		ProductoDTOResponse dto = null;
		List<Productos> p = repository.findAll();
		
		for(Productos productos : p) {
			
			dto = new ProductoDTOResponse();
			dto.setDescripcionProducto(productos.getDescripcion());
			dto.setNombre(productos.getNombreProducto());
			dto.setPrecioProducto(productos.getPrecio());
			dto.setStockProducto(productos.getStock());
			dto.setId(productos.getIdProducto());
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public ProductoDTOResponse obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
		
		Productos productos =  repository.findById(id).orElse(null);
		ProductoDTOResponse dto = new ProductoDTOResponse();
		dto.setDescripcionProducto(productos.getDescripcion());
		dto.setNombre(productos.getNombreProducto());
		dto.setPrecioProducto(productos.getPrecio());
		dto.setStockProducto(productos.getStock());
		dto.setId(productos.getIdProducto());
		return dto;
	}
	
	

}
