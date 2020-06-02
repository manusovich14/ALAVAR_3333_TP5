package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase que representa a una cuota de pago
 * @author Emanuel Alavar
 *
 */
@Component
public class Cuota {
	private long id;
	private LocalDate fechaPago;
	private String periodo;
	private Double monto;
	private String estado;
	 @Autowired
	private Usuario usuario;
	
	/**
	 * Constructor por defecto
	 */
	public Cuota() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor parametrizado
	 * @param id es el identificador de la cuota
	 * @param fechaPago es la fecha de la cuota
	 * @param periodo es la duracion de la cuota
	 * @param monto es el valor de la cuota
	 * @param estado es para verificar si se pago o no la cuota
	 * @param usuario es el nombre de la persona que tiene la cuota
	 */
	public Cuota(long id, LocalDate fechaPago, String periodo, Double monto, String estado, Usuario usuario) {
		super();
		this.id = id;
		this.fechaPago = fechaPago;
		this.periodo = periodo;
		this.monto = monto;
		this.estado = estado;
		this.usuario = usuario;
	}

	/**
	 * Metodos accesores get y set
	 */
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public LocalDate getFechaPago() {
		return fechaPago;
	}


	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}


	public String getPeriodo() {
		return periodo;
	}


	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}


	public Double getMonto() {
		return monto;
	}


	public void setMonto(Double monto) {
		this.monto = monto;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Metodo to string devuelve el valor de todos los atributos de la clase cuota
	 */
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
				+ ", estado=" + estado + ", usuario=" + usuario + "]";
	}
	
	
}
