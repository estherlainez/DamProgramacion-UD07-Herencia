package Ejemplo_ClaseAbstracta;

public class Empleado extends Persona{

		int sueldo;
		int numOperario;
		
		public String dameDescripcion() {
			return"Empleado"+super.getNombre()+" Sueldo "+this.sueldo+
			" Numero Operario "+this.numOperario;
		}
		
		public Empleado(String n, int s) {
			super(n);
			this.sueldo=s;
		}

}
