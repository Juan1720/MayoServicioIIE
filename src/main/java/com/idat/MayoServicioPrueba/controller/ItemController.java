package com.idat.MayoServicioPrueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MayoServicioPrueba.model.Item;
import com.idat.MayoServicioPrueba.model.Productos;
import com.idat.MayoServicioPrueba.service.ItemService;

@Controller
@RequestMapping("/item/v1")
public class ItemController {
	
	@Autowired
	private ItemService service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<Item>> listar(){
		return new ResponseEntity<List<Item>>(service.listarItem(), HttpStatus.OK) ;
		
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Item items) {
		service.guadarItem(items);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping( path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		Item  items = service.obtenerItemId(id);
		if(items != null) {
			service.eliminarItem(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping( path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@RequestBody Item items){
		
		Item i = service.obtenerItemId(items.getIdItem());
		if(i != null) {
			service.actualizarItem(items);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping( path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Item> obtenerId(@PathVariable Integer id){
		
		Item i = service.obtenerItemId(id);
		if(i != null) {
			return new ResponseEntity<Item>(service.obtenerItemId(id),HttpStatus.OK);
		}
		
		return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
	}


}
