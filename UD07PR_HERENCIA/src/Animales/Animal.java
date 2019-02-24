package Animales;

public class Animal {
	 private char sexo;
	 
	//constructores
	public Animal() {
		this.sexo='M';
		
	}
	
	public Animal(char s) {
		this.sexo=s;
	}
	
	public char getSexo() {
		return this.sexo;
	}

	
	
	public void dormir() {
		System.out.println("Zzzzzzz.....");
	}
	
	public void comer(String comida) {
		System.out.println("Estoy comiendo"+comida);
	}
}
