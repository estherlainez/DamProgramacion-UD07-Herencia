package Ejemplo_ClaseAbstracta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona [] Personajes = new Persona [2];
		
		Personajes [0]= new Empleado("Vyserion", 5000);
		Personajes [1]= new Alumno ("Pepe", "DAM");
		
		for (Persona p:Personajes) {
			System.out.println(p.dameDescripcion());
		}
	}
}
