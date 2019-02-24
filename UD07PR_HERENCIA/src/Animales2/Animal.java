package Animales2;
abstract class Animal {
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

	
	
	public abstract void dormir();
	
	public abstract void comer(String comida); 
}
