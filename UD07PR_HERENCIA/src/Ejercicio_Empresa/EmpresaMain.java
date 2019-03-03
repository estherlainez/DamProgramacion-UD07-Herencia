package Ejercicio_Empresa;
import java.util.Scanner;
public class EmpresaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int limiteEmpleado=15;
		int opcion=0,aum=0,num;
		
		Empresa e= new Empresa ("Trw automotive", limiteEmpleado);
		
		Empleado empleado1 = new Empleado (e, "Mario Vaquerizo", 10000 );
		e.añadirEmpleado(empleado1);
		
		Empleado empleado2 = new Empleado (e, "Lucas Jimenez", 15000 );
		e.añadirEmpleado(empleado2);
		
		Empleado empleado3 = new Empleado (e, "Julian Sanchez", 14000 );
		e.añadirEmpleado(empleado3);
		
		Empleado empleado4 = new Empleado (e, "Paco Rodriguez", 17000 );
		e.añadirEmpleado(empleado4);
		
		Empleado empleado5 = new Empleado (e, "David Perez", 10000 );
		e.añadirEmpleado(empleado5);
		
		Empleado empleado6 = new Empleado (e, "Miguel Martinez", 20000 );
		e.añadirEmpleado(empleado6);
		
		Empleado empleado7 = new Empleado (e, "Juan Carlos Martinez", 13000 );
		e.añadirEmpleado(empleado7);
		
		Empleado empleado8 = new Empleado (e, "Victor Rodriguez", 14000 );
		e.añadirEmpleado(empleado8);
		
		Empleado empleado9 = new Empleado (e, "Sonia Del Rio", 14000 );
		e.añadirEmpleado(empleado8);
		
		Empleado empleado10 = new Empleado (e, "Elena Latorre", 14000 );
		e.añadirEmpleado(empleado8);
		System.out.println(e.toString()+"\n\n");		
		
				
		System.out.println(e.toString());	
		
		do {
			System.out.println("Elija la opcion que desea realizar");
			System.out.println("1.AÑADIR UN NUEVO EMPLEADO");
			System.out.println("2.DESPEDIR UN EMPLEADO");
			System.out.println("3.AUMENTAR EL SUELDO A UN EMPLEADO");
			System.out.println("4.SALIR");
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("1.AÑADIR UN NUEVO EMPLEADO");
				Empleado empleado11 = new Empleado (e, "Alejandro Sanz", 20000 );
				e.añadirEmpleado(empleado11);
				System.out.println(e.toString()+"\n\n");
				break;
				
			
			case 2:
				System.out.println("2.DESPEDIR UN EMPLEADO");
				System.out.println("¿Que numero de empleado se va a despedir?");
				num=teclado.nextInt();
				if(num<=limiteEmpleado) {
				e.despideEmpleado(num);
				System.out.println(e.toString()+"\n\n");
				}else {
					System.out.println("El numero elegido no es correcto");
				}
				break;
				
			case 3:
				System.out.println("3.AUMENTAR EL SUELDO A UN EMPLEADO");
				System.out.println("¿En que pocentaje aumentara el salario?");
				aum=teclado.nextInt();
				empleado1.subirSueldo(aum);
				System.out.println(e.toString()+"\n\n");
				break;
				
			case 4:
				System.out.println("4.SALIR");
				break;
				
			}
			
		}while(opcion!=5);
		
		
	}

}
