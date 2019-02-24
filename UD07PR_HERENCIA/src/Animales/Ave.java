package Animales;

public class Ave extends Animal {

	public Ave() {
		super();
	}
	public Ave(char s) {
		super(s);
	}

	public void Volar() {
		System.out.println("Estoy volando");
	}
	
	public void ponerHuevos(int n) {
		if (this.getSexo()=='M') {
		System.out.println("no puede poner huevos");
		}else {
			System.out.println("El ave ha puesto "+ n +"huevos");
		}
	}
	
	public void limpiarse() {
		System.out.println("Me estoy limpiando");
	}
	
}
