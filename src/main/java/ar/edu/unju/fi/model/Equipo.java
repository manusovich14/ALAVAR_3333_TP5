package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Equipo {
	private String nombre;
	 @Autowired
	private Estadio estadio;
	
	public Equipo() {
		// TODO Auto-generated constructor stub
	}

	public Equipo(String nombre, Estadio estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
	
	
}