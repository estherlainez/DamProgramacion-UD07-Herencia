package Animales2;
public class AnimalesMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perro laika = new Perro ('H');
		laika.comer(" pienso para perros");
		laika.dormir();
		laika.amamantar();
		laika.andar();
		laika.cuidarCrias();
		laika.darPata();
		laika.cazar();
		laika.ladrar();
		
		System.out.println("\nCREAMOS UN MAMIFERO");
		Mamifero m =new Mamifero ('H');
		m.comer("comida");
		m.amamantar();
		m.dormir();
		m.andar();
		m.cuidarCrias();
		
		System.out.println("\nCREAMOS UN ANIMAL");
		Ave a= new Ave ('H');
		a.comer("comida");
		a.dormir();
		System.out.println(a.getSexo());
		
		
		
		
	}

}