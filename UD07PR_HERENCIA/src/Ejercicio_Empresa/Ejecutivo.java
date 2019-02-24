package Ejercicio_Empresa;

public class Ejecutivo extends Empleado{
	 private int presupuesto;

	public Ejecutivo(Empresa dE, String n, int s) {
		super(dE, n, s);
		
	}
	public Ejecutivo(Empresa dE, String n, int s, int nE) {
		super(dE, n, s,nE);
		
	}
	
	public int getPresupuesto() {
		return presupuesto;
	}
	
	
	public int asignaPresupuesto(int p) {
		this.presupuesto=p;
		return presupuesto;
	}
	
	public void ascender(Empresa dE, String n, int s) {
		Ejecutivo ej=new Ejecutivo ( dE, n, s);
	}
	@Override
	public String toString() {
		return "Ejecutivo [presupuesto=" + presupuesto + "]";
	}
	
	
}
