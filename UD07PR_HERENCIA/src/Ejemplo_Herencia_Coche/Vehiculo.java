package Ejemplo_Herencia_Coche;

public class Vehiculo {

	/*Creamos una SUPERCLASE que con la informacion
	 * de los vehiculos coche y furgoneta heredan de vehiculo
	 */
	
	//creamos los atributos
	private int ruedas;
	private int largo;
	private int motor;
	private int peso;
	private String color;
	private int peso_total;
	private boolean asientos_cuero;
	
	public Vehiculo() {
		this.ruedas=4;
		this.largo=2000;
		this.motor=1600;
		this.peso=500;
	}
	
	
	@Override
	public String toString() {
		return "Vehiculo [ruedas=" + ruedas + ",\n largo=" + largo + ",\n motor=" + motor + ",\n peso=" + peso + ",\n color="
				+ color + ",\n peso_total=" + peso_total + ",\n asientos_cuero=" + asientos_cuero + "]";
	}


	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPeso_total() {
		return peso_total;
	}

	public void setPeso_total(int peso_total) {
		this.peso_total = peso_total;
	}

	public boolean isAsientos_cuero() {
		return asientos_cuero;
	}

	public void setAsientos_cuero(boolean asientos_cuero) {
		this.asientos_cuero = asientos_cuero;
	}

}
