package Animales2;

public class Mamifero extends Animal {
	//no a�ado atributos,solo tendremos
	//el atributo heredado de la clse animal(sexo)
	
	//constructores
	
	public Mamifero() {
		super();
	}
	
	public Mamifero(char s ) {
		super(s);
	}
	
	
	//metodo propios de la clase mamifero 
	
	public void dormir() {
		System.out.println("Zzzzzzz.....en mi casita");
	}
	
	public void comer(String comida) {
		System.out.println("Estoy comiendo  "+comida);
	}
	
	public void amamantar() {
		if (this.getSexo()=='M') {
		System.out.println("no puede amamantar");
		}else {
			System.out.println("AMAMANTAR...");
		}
	}
	
	public void cuidarCrias() {
		System.out.println("estoy cuidando a mis crias");		
	}
	
	public void andar() {
		System.out.println("Estoy andando...");
		
	}
}