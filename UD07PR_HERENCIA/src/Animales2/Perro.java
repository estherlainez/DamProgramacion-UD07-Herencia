package Animales2;

import Animales.Mamifero;

public class Perro extends Mamifero{
	
	public Perro() {
		super();
	}
	
	public Perro(char s) {
		super(s);
		
	}
	
	public void ladrar() {
		System.out.println(" Guau guau");
	}
	
	public void darPata() {
		System.out.println("Toma mi patita");
	}
	
	public void cazar() {
		System.out.println(" Estoy cazando perdices");
	}
}
