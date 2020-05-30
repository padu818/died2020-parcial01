package isi.died2020.parcial01.ejercicio02.app;

public class ExceptionRegular extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionRegular() {
		super("El alumno el alumno no posee una inscripción a "
				+ "cursado con el estado REGULAR en la materia que se quiere inscribir");
	}
}
