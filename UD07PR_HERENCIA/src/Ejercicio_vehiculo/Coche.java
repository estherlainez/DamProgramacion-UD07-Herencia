package Ejercicio_vehiculo;

public class Coche extends Vehiculo {

	private int cilindrada;
	
	public Coche(int c) {
		super();
		this.cilindrada=c;
	}
	
	public static void quemarRueda() {
		System.out.println("Estoy quemando rueda con el coche");
	}
	public static void andarCoche(int km) {
		System.out.println("He recorrido con el coche "+km+" Kilometros");
	}
}
