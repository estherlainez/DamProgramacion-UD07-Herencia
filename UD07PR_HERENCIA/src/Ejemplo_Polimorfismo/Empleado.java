package Ejemplo_Polimorfismo;

public class Empleado {

	//usamos final para que una vez creado el objeto no se pueda modificar 
	//el valor del atributo

	//atributo de clase
	public static int idSiguiente=1;
	
	//atributos de objeto
	private final String nombre;
	private String sección;
	public double sueldo;
	private int id;
	
	public Empleado(String n, double sueldo) {
		this.nombre=n;
		this.sueldo=sueldo;
		this.sección="Administración";
		this.id=idSiguiente;
		idSiguiente++;
	}

	/*public void setNombre(String n) { ya no tiene sentido puesto que nombre está protegido
	this.nombre=n;
	}*/

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sección=" + sección + ", sueldo=" + sueldo + ", id=" + id + "]";
	}
	

	public static int getIdSiguiente() {
		return idSiguiente;
	}

	public static void setIdSiguiente(int idSiguiente) {
		Empleado.idSiguiente = idSiguiente;
	}

	public String getSección() {
		return sección;
	}

	public void setSección(String sección) {
		this.sección = sección;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	//metodo para subir sueldo
	public void subirSueldo(double porcentaje) {
		double aumento=(this.sueldo*porcentaje)/100;
		this.sueldo=sueldo+aumento;
	}
	
	
	
}