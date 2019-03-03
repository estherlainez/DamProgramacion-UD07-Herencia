package Ejercicio_Empresa;

public class Ejecutivo extends Empleado{
	 private int presupuesto;

	public Ejecutivo(Empresa dE, String n, int s,int p) {
		super(dE, n, s);
		this.presupuesto=p;
		
	}


	
	public int getPresupuesto() {
		return presupuesto;
	}
	
	
	public int asignaPresupuesto(int p) {
		this.presupuesto=p;
		return presupuesto;
	}
	
	public void ascender(Empresa dE, String n, int s,int p) {
		Ejecutivo ej=new Ejecutivo ( dE, n, s,p);
	}
	@Override
	public String toString() {
		return "Ejecutivo [presupuesto=" + presupuesto + "]";
	}
	
	
}
