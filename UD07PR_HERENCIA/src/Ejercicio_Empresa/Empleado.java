package Ejercicio_Empresa;

public class Empleado {
	
	Empresa datosEmpresa;
	protected String nombre;
	protected int sueldo;
	private int numOp;
	static int numeroOperario=1;
	public Empleado(Empresa dE ,String n, int s) {
		this.datosEmpresa=dE;
		this.nombre=n;
		this.sueldo=s;
		this.numOp=numeroOperario;
		numeroOperario++;
	}
	
	protected Empleado(Empresa dE, String n, int s, int nu) {
		this.datosEmpresa=dE;
		this.nombre=n;
		this.sueldo=s;
		this.numOp=numeroOperario;
		numeroOperario++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String n) {
		this.nombre = n;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int s) {
		this.sueldo = s;
	}

	
	public void subirSueldo(double porcentaje) {
		double aumento=(this.sueldo*porcentaje)/100;
		this.sueldo=(int) (sueldo+aumento);
	}

	@Override
	public String toString() {
		return "Empleado [datosEmpresa=" + datosEmpresa + ", nombre=" + nombre + ", sueldo=" + sueldo + ", numOp="
				+ numOp + "]";
	}


	
	
}
