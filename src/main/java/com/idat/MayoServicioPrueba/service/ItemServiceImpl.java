package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.Repository.ItemRepository;
import com.idat.MayoServicioPrueba.model.Item;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository repository;

	@Override
	public void guadarItem(Item items) {
		// TODO Auto-generated method stub
		repository.save(items);
		
	}

	@Override
	public void actualizarItem(Item items) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(items);
	}

	@Override
	public void eliminarItem(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public List<Item> listarItem() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Item obtenerItemId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
