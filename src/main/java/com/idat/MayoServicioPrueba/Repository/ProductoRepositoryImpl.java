package com.idat.MayoServicioPrueba.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.idat.MayoServicioPrueba.model.Productos;

@Repository
public class ProductoRepositoryImpl implements ProductoRepository {
	
	public List<Productos> listar = new ArrayList<Productos>();


	@Override
	public void guardarProducto(Productos productos) {
		listar.add(productos);
	}

	@Override
	public void actualizarProducto(Productos producto) {
		// TODO Auto-generated method stub
		listar.remove(0);
		listar.add(producto);
	}

	@Override
	public void eliminarProducto(Integer id) {
		Productos p = obtenerProductoId(id);
		listar.remove(0);
		
	}

	@Override
	public List<Productos> listarProducto() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
	/*	if(listar != null) {
		for(Productos productos : listar) {
			if(productos.getIdProducto()==  id)
				return productos;
		}
		}
		return null;	
	}*/
		
	return listar.stream().filter( p -> p.getIdProducto() == id ).findFirst().orElse(null);
	}

}
