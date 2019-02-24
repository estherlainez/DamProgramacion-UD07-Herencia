package Ejemplo_ClaseAbstracta;

abstract class Persona {

	private String nombre;
	
	public Persona (String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	

	public abstract String dameDescripcion();
	
}