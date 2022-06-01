package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.Repository.ClienteRepositoy;
import com.idat.MayoServicioPrueba.model.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepositoy repository;

	@Override
	public void guardarCliente(Cliente clientes) {
		repository.save(clientes);
		
	}

	@Override
	public void actulizarCliente(Cliente clientes) {
		// TODO Auto-generated method stub
		
		repository.saveAndFlush(clientes);
		
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cliente obtenerClientesId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}
	

}
