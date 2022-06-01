package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Item;

public interface ItemService {
	
	void guadarItem(Item items);
	void actualizarItem(Item items);
	void eliminarItem(Integer id);
	List<Item> listarItem();
	Item obtenerItemId(Integer id);

}
