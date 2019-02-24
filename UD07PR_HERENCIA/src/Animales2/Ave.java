package Animales2;

public class Ave extends Animal {

	public Ave() {
		super();
	}
	public Ave(char s) {
		super(s);
	}

	public void dormir() {
		System.out.println("Zzzzzzz.....");
	}
	public void comer(String comida) {
		System.out.println("Estoy comiendo "+comida);
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
