package Ejemplo_ClaseAbstracta;

public class Alumno extends Persona{

	private String ciclo;
	
	public Alumno(String c, String n) {
		super(n);
		this.ciclo=c;
	}
	
	public String getCiclo() {
		return this.ciclo;
	}
	
	public void setCiclo(String c) {
		this.ciclo=c;
	}

	@Override
	public String toString() {
		return "Alumno [ciclo=" + ciclo + "]";
	}
	
	public String dameDescripcion() {
		return "Alumno: "+super.getNombre()+" Ciclo: "+this.ciclo;
	}
}
