package com.equifax.dev.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos_clientes")
public class ProductosClientes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "producto_cliente_id")
	private Integer productoClienteId;
	
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;
	
	@Column(name = "observacion")
	private String observacion;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id", referencedColumnName = "clienteId")
	private Set<Cliente> clientes;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "producto_id", referencedColumnName = "productoId")
	private Set<Producto> productos;
	
	public ProductosClientes() {
		super();
	}

	
	public ProductosClientes(Integer productoClienteId, Date fechaCreacion, String observacion, Integer cantidad,
			Set<Cliente> clientes, Set<Producto> productos) {
		super();
		this.productoClienteId = productoClienteId;
		this.fechaCreacion = fechaCreacion;
		this.observacion = observacion;
		this.cantidad = cantidad;
		this.clientes = clientes;
		this.productos = productos;
	}


	public Integer getProductoClienteId() {
		return productoClienteId;
	}

	public void setProductoClienteId(Integer productoClienteId) {
		this.productoClienteId = productoClienteId;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "ProductosClientes [productoClienteId=" + productoClienteId + ", fechaCreacion=" + fechaCreacion
				+ ", observacion=" + observacion + ", cantidad=" + cantidad + ", clientes=" + clientes + ", productos="
				+ productos + "]";
	}

}
