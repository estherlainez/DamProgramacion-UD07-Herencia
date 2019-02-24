package EjemploFinal;

public class MainFinal {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Empleado trabajador1 = new Empleado ("Paco");
		Empleado trabajador2 = new Empleado ("Ana");
		/*vale, qie ocurre si tenemos que crear 500 objetos?
		 * vamos a hacer que el id se asigne automaticamente
		 * necesitamos que haya una copia de id unica.
		 * el modificador static hace que la variable id
		 * sea compartida, que todos puedan acceder a 
		 * esa variable
		 */

		
		trabajador1.setSeccion("RRHH");
		System.out.println(trabajador1.toString());
	
		//ojo, la variable es de la clase, no pertenece al objeto
		System.out.println(Empleado.IdSiguiente);
	
		System.out.println(trabajador2.toString());
	}

}
