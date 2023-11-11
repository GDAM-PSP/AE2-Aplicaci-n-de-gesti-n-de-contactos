package modelo;

import java.io.Serializable;

public class Persona implements Serializable{
	private String nombre;
	private String telefono;
	
	
	public Persona(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
