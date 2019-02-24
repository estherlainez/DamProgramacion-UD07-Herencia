package Ejercicio_vehiculo;

public class Vehiculo {
	//atributos de clase
	private static int kilometrosTotales=0;
	private static int vehiculosCreados=0;

	//atributos de instancia
	private int kilometrosRecorridos;
	
	public Vehiculo() {
		this.kilometrosRecorridos = 0;
		Vehiculo.vehiculosCreados=Vehiculo.vehiculosCreados+1;
	}
	
	public void Recorre(int km) {
		Vehiculo.kilometrosTotales=Vehiculo.kilometrosTotales+km;
		this.kilometrosRecorridos =kilometrosRecorridos +km;
	}

	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}

	public static void setKilometrosTotales(int kilometrosTotales) {
		Vehiculo.kilometrosTotales = kilometrosTotales;
	}

	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}

	public static void setVehiculosCreados(int vehiculosCreados) {
		Vehiculo.vehiculosCreados = vehiculosCreados;
	}

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	@Override
	public String toString() {
		return "Vehiculo [kilometrosRecorridos=" + kilometrosRecorridos + "]";
	}
	
	
}
