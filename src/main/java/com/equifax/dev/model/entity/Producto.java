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
@Table(name = "producto")
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "producto_id")
	private Integer idProducto;

	@Column(name = "nombre_producto")
	private String nombreProducto;

	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	@Column(name = "estado")
	private String estado;

	@OneToMany(targetEntity = ProductosClientes.class, mappedBy = "producto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<ProductosClientes> productosClientes;

	public Producto() {
		super();
	}

	public Producto(Integer idProducto, String nombreProducto, Date fechaCreacion, String estado) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.fechaCreacion = fechaCreacion;
		this.estado = estado;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
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
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", fechaCreacion="
				+ fechaCreacion + ", estado=" + estado + ", productosClientes=" + productosClientes + "]";
	}
	

}
