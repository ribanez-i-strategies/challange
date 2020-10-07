package com.equifax.dev.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Integer clienteId;
	
	@Column(name="nombre_cliente")
	private String nombreCliente;
	
	@Column(name="fecha_creacion")
	private Date fechaCreacion;
	
	@Column
	private String estado;
	
	@OneToMany(targetEntity = ProductosClientes.class, mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<ProductosClientes> productosClientes;
	
	public Cliente() {
		super();
	}


	public Cliente(Integer clienteId, String nombreCliente, Date fechaCreacion, String estado) {
		super();
		this.clienteId = clienteId;
		this.nombreCliente = nombreCliente;
		this.fechaCreacion = fechaCreacion;
		this.estado = estado;
	}



	public Integer getClienteId() {
		return clienteId;
	}


	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", nombreCliente=" + nombreCliente + ", fechaCreacion="
				+ fechaCreacion + ", estado=" + estado + ", productosClientes=" + productosClientes + "]";
	}


}
