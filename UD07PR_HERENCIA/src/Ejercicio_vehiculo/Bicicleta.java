package Ejercicio_vehiculo;

public class Bicicleta extends Vehiculo {
	private int pinones;
	
	public Bicicleta(int p) {
		super();
		this.pinones = p;
	}
	
	public void hazCaballito() {
		System.out.println("Estoy haciendo caballito");
	}
	public void andarBicicleta(int km) {
		System.out.println(km+"km recorridos");
	}

	public int getPinones() {
		return pinones;
	}

	public void setPinones(int pinones) {
		this.pinones = pinones;
	}

	@Override
	public String toString() {
		return "Bicicleta [pinones=" + pinones + "]";
	}
	

}
