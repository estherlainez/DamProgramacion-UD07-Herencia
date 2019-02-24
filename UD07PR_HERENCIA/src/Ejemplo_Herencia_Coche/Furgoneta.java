package Ejemplo_Herencia_Coche;

public class Furgoneta extends Vehiculo{
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta (int cC, int pe) {
		super();
		this.capacidad_carga=cC;
		this.plazas_extra=pe;
	}
	
	public void cargaFurgoneta() {
		System.out.println("Cargo la furgoneta de Cipotegatos");
		
	}
	
	public void descargaFurgoneta() {
		System.out.println("descargo Cipotegatos");
		
	}

	@Override
	public String toString() {
		return "Furgoneta [capacidad_carga=" + capacidad_carga + ",\n plazas_extra=" + plazas_extra + "]";
	}

}
