package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase Estadio representa a un estadio de futbol
 * @author manus
 *
 */
@Component
public class Estadio {
	private String nombre;
	private LocalDate fechaFundacion;
	private String cuidad;
	private int capacidad;
	private String direccion;
	
	/**
	 * Constructor por defecto
	 */
	public Estadio() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor Parametrizado
	 * @param nombre
	 * @param fechaFundacion
	 * @param cuidad
	 * @param capacidad
	 * @param direccion
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String cuidad, int capacidad, String direccion) {
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.cuidad = cuidad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public String getCuidad() {
		return cuidad;
	}

	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", cuidad=" + cuidad
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
	}
	
	
	
}
