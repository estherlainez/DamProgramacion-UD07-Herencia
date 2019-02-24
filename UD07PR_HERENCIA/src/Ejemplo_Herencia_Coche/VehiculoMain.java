package Ejemplo_Herencia_Coche;

public class VehiculoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo v=new Vehiculo();
		//System.out.println(v.toString());
		
		Coche c=new Coche ("Maria Perez");
		System.out.println(c.toString());
		
		c.getColor();
		c.setColor("verde");
		System.out.println(c.toString());
		
		c.arrancaCoche();
		
		Furgoneta f= new Furgoneta(4,5);
		System.out.println(f.toString());
	
	}

}
