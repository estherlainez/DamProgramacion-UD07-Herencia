package Ejemplo_Herencia_Coche;

public class Coche extends Vehiculo {
	String conductor;
	
	public Coche() {
		super(); //llamamos al constructor de la clase de la
				//que heredamos
		
		this.conductor="Maria Gracia";
		
	}
	public Coche(String n) {
		super(); //llamamos al constructor de la clase de la
				//que heredamos
		
		this.conductor=n;
		
	}
	
	public void arrancaCoche() {
		System.out.println("meter llave y girar. Esperar brrrr");
		
	}
	
	public void paraCoche() {
		System.out.println("freno de mano, apagar luces y quitar la llave");
		
	}
	@Override
	public String toString() {

		return super.toString()+" \nCoche [conductor=" + conductor + "]";
	}
}
