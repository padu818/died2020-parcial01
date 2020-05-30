package isi.died2020.parcial01.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * Se necesita implementar la aplicación RRHH que tiene un método que recibe una lista de empleados y
 *  retorna una lista de recibos de sueldo. El recibo de sueldo tiene un numero, un mes al que pertenece,
 *   y el total del pago, y un puntero al empleado que lo recibe.

 Crear las clases que considere necesarias para resolver este problema y 
 crear una clase de test unitario para probar el método que genera un recibo de sueldo y
  escribir un test para dicha clase.
 */
	
public class RRHH {
	
	public class Recibo{
		public Integer id;
		public Integer mes; //decidi dejar el mes de 1 a 12 correspondiente a los meses
		public Double pago;
		public Empleado asociado;
		
		public Recibo(Integer i, Integer m, Double pag, Empleado e) {
			id = i;
			mes = m;
			pago = pag;
			asociado = e;
		}

		
		public List<Recibo> listRecibos(List<Empleado> empleados){
			List<Recibo> dev = new ArrayList<Recibo>();
			Integer identificadorSecuencial = 0;
			LocalDate b =LocalDate.now();
			for(Empleado e: empleados) {
				Recibo aux = new Recibo(identificadorSecuencial,b.getMonthValue(), e.sueldo(), e);
				identificadorSecuencial++;
				dev.add(aux);
			}
			return dev;
		}
		
	}
	

}
