package Ejercicio_vehiculo;
import java.util.Scanner;
public class VehiculoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int opcion=0,km=0;
		Coche c1= new Coche(100);
		Bicicleta b1= new Bicicleta(20);
		do {
			System.out.println("1.ANDA CON LA BICICLETA");
			System.out.println("2.CABALLITO CON LA BICICLETA");
			System.out.println("3.ANDA EN COCHE");
			System.out.println("4.QUEMA RUEDA CON EL COCHE");
			System.out.println("5.VER KILOMETROS HECHOS CON LA BICICLETA");
			System.out.println("6.VER KILOMETROS HECHOS CON EL COCHE");
			System.out.println("7.VER KILOMETROS TOTALES");
			System.out.println("8.VEHICULOS CREADOS");
			System.out.println("9.SALIR");
			System.out.println("Elige una opcion: ");
			
			opcion=teclado.nextInt();
			
			switch(opcion) {

			case 1:
				System.out.println("ANDA CON LA BICICLETA");
				System.out.println("¿Cuantos km has hecho con la bicicleta?");
				km=teclado.nextInt();
				b1.andarBicicleta(km);
				b1.Recorre(km);
				System.out.println(c1.getKilometrosRecorridos()+" kilometros en bicicleta");
				break;
			case 2:
				System.out.println("HAZ EL CABALLITO CON LA BICICLETA");
				b1.hazCaballito();
				break;
			case 3:
				System.out.println("ANDA CON EL COCHE");
				System.out.println("¿Cuantos km has hecho con el coche?");
				km=teclado.nextInt();
				c1.andarCoche(km);
				c1.Recorre(km);
				System.out.println(c1.getKilometrosRecorridos()+" kilometros en coche");
				break;
			case 4:
				System.out.println("QUEMA RUEDA CON EL COCHE");
				c1.quemarRueda();
				break;
			case 5:
				System.out.println("VER KILOMETROS DE LA BICICLETA");
				b1.getKilometrosRecorridos();
				System.out.println(b1.getKilometrosRecorridos() + " Km");
				break;
			case 6:
				System.out.println("VER KILOMETROS DEL COCHE");
				c1.getKilometrosRecorridos();
				System.out.println(c1.getKilometrosRecorridos() + " Km");
				break;
			case 7:
				System.out.println("VER KILOMETROS TOTALES");
				System.out.println("Total: ");
		          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
				break;
			case 8:
				System.out.println("VER LOS VEHICULOS CREADOS");
				System.out.println("VEHICULOS CREADOS: "+Vehiculo.getVehiculosCreados());
				break;
			case 9:
				System.out.println("HASTA PRONTO CONDUCTOR!!!");
				break;
				
			}
			
		}while(opcion!=8);
	}

}
