package com.idat.MayoServicioPrueba.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.MayoServicioPrueba.model.Cliente;

public interface ClienteRepositoy extends JpaRepository<Cliente, Integer> {

}
