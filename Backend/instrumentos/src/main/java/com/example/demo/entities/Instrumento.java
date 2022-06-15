package com.example.demo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "api_instrumento")

public class Instrumento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	
	@Column (name = "id")
	private int id;
	
	@Column (name = "instrumento")
	private String instrumento;
	
	@Column (name = "marca")
	private String marca;
	
	@Column (name = "modelo")
	private String modelo;
	
	@Column (name = "imagen")
	private String imagen;
	
	@Column (name = "precio")
	private int precio;
	
	@Column (name = "costoEnvio")
	private String costoEnvio;
	
	@Column (name = "cantidadVendida")
	private int cantidadVendida;
	
	@Column (name = "descripcion")
	private String descripcion;

	public Instrumento() {
	
	}

	public Instrumento(int id, String instrumento, String marca, String modelo, String imagen, int precio, String costoEnvio, int cantidadVendida, String descripcion) {
		
		this.id = id;
		this.instrumento = instrumento;
		this.marca = marca;
		this.modelo = modelo;
		this.imagen = imagen;
		this.precio = precio;
		this.costoEnvio = costoEnvio;
		this.cantidadVendida = cantidadVendida;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getCostoEnvio() {
		return costoEnvio;
	}

	public void setCostoEnvio(String costoEnvio) {
		this.costoEnvio = costoEnvio;
	}

	public int getCantidadVendida() {
		return cantidadVendida;
	}

	public void setCantidadVendida(int cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
