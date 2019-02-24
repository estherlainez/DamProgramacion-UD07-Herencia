package Ejemplo_Polimorfismo;

public class Jefe extends Empleado{

	private double incentivo;
	
	public Jefe(String n, double s, double i) {
		super(n, s);
		this.incentivo=i;
	}
	
	//invalida getSueldo de empleado solo para la clase jefe, ya que los empleados normales no tienen incentivos
	public double getSueldo() {
		double sueldoJefe=super.getSueldo()+this.incentivo;
		return sueldoJefe;
	}
	
	public void setIncentivo(double i){
		this.incentivo=i;
	}
}
