package isi.died2020.parcial01.ejercicio01;

import java.time.LocalDate;

public class Efectivo extends Empleado {
	public Efectivo() {
		super();
	}
	//verificando.
	public Efectivo(Double sueldo) {
		super(sueldo);
	}

	@Override
	public Double sueldo() {
		LocalDate a = LocalDate.now();
		if(a.getMonthValue() == 3 ) {
			return sueldoBasico*1.5-(sueldoBasico*0.11)-(sueldoBasico*0.03)+this.obtenerGastos();
		}
		else
			return sueldoBasico-(sueldoBasico*0.11)-(sueldoBasico*0.03)+this.obtenerGastos();
	}

	@Override
	public Double obtenerGastos() {
		Double aux = 0.0;
		for(Gasto g: gastos) {
			if(g.getBandera() == true)
			aux+= g.getGasto();
		}
		return aux;
	}
}
