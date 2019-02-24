package Animales2;

public class Lagarto extends Animal{
	
	public Lagarto() {
		super();
	}
	
	public Lagarto(char s) {
		super(s);
		
	}
	
	public void dormir() {
		System.out.println("Zzzzzzz.....durmiendo al sol");
	}
	
	public void comer(String comida) {
		System.out.println("Estoy comiendo"+comida);
	}
	
	
	public void tomarElSol() {
		System.out.println("Estoy tomando el sol");
	}
	public void refugiarse() {
		System.out.println("Estoy refugiada");
	}
	
	
}