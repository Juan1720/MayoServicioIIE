package com.idat.MayoServicioPrueba.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Proveedores")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idProveedor;
	private String provedor;
	private String direccion;
	
	@OneToOne
	@JoinColumn(name = "id_producto", nullable = false, 
	foreignKey = 
	@ForeignKey(foreignKeyDefinition = "foreign key(id_producto) references Productos(id_producto)"))
	private Productos productos;
	
	
	public Integer getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getProvedor() {
		return provedor;
	}
	public void setProvedor(String provedor) {
		this.provedor = provedor;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Productos getProductos() {
		return productos;
	}
	public void setProductos(Productos productos) {
		this.productos = productos;
	}
	
	

}
