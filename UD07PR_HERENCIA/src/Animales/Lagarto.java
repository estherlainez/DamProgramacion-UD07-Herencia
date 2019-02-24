package Animales;

public class Lagarto extends Animal{
	
	public Lagarto() {
		super();
	}
	
	public Lagarto(char s) {
		super(s);
		
	}
	
	public void tomarElSol() {
		System.out.println("Estoy tomando el sol");
	}
	public void refugiarse() {
		System.out.println("Estoy refugiada");
	}
	
	
}
