package isi.died2020.parcial01.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * Es necesario modelar la forma en que se registran y pagan
 *  los sueldos de los empleados. De todos los empleados
 *   se conoce su DNI que es un valor numérico, su nombre, la fecha de contratación y su correo electrónico.

	Efectivos: son empleados efectivos en relación de dependencia con la empresa.
	Jerarquicos: son los jefes de plantas y departamentos.
 */


public abstract class Empleado {
	protected Integer dni;
	protected String Nombre;
	protected LocalDate inicioContrato;
	protected String correo;
	protected Double sueldoBasico;
	protected List<Gasto> gastos;
	
	public Empleado(Double sueldo) {
		super();
		sueldoBasico = sueldo;
		gastos = new ArrayList<Gasto>();
	}
	
	public Empleado() {
		super();
	}
	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public LocalDate getInicioContrato() {
		return inicioContrato;
	}

	public void setInicioContrato(LocalDate inicioContrato) {
		this.inicioContrato = inicioContrato;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(Double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public List<Gasto> getGastos() {
		return gastos;
	}

	public void setGastos(List<Gasto> gastos) {
		this.gastos = gastos;
	}

	public abstract Double sueldo();
	
	public abstract Double obtenerGastos();

}
