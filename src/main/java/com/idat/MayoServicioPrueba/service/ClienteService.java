package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Cliente;

public interface ClienteService {
	
	void guardarCliente(Cliente clientes);
	void actulizarCliente(Cliente clientes);
	void eliminarCliente(Integer id);
	List<Cliente> listarCliente();
	Cliente obtenerClientesId(Integer id);

}
