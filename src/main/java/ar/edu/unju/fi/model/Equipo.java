package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *Clase Equipo representa a un equipo de futbol 
 * @author Emanuel Alavar
 *
 */
@Component
public class Equipo {
	private String nombre;
	 @Autowired
	private Estadio estadio;
	
	 /**
	  * Constructor por defecto
	  */
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor parametrizado
	 * @param nombre representa al nombre del equipo
	 * @param estadio representa a la clase estadio
	 */
	public Equipo(String nombre, Estadio estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
	}
	
	/**
	 * Metodos accesores get y set de todos los atributos de la clase Equipo
	 * 
	 */
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
	
	/**
	 * Metodo toString devuelve todos los valores asignados a los atributos de la clase Equipo
	 */
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
	
	
}