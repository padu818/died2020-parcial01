package isi.died2020.parcial01.ejercicio01;

import java.time.LocalDate;

public class Jerarquico extends Empleado{
	public Jerarquico() {
		super();
	}

	public Double sueldo() {
		LocalDate a = LocalDate.now();
		if(a.getMonthValue() == 3 ) {
			return sueldoBasico*1.5+(sueldoBasico*0.08)-(sueldoBasico*0.05)+this.obtenerGastos()*1.1;
		}
		else
			return sueldoBasico+(sueldoBasico*0.08)-(sueldoBasico*0.05)+this.obtenerGastos()*1.1;
	}	

	public Double obtenerGastos() {
		Double aux = 0.0;
		for(Gasto g: this.getGastos()) {
			aux+= g.getGasto();
		}
		return aux;
	}
}
