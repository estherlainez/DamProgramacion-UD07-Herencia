package Ejemplo_Polimorfismo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado e=new Empleado("Pepe", 10000);
		Jefe j=new Jefe("Paqui", 10000, 5000);
		Empleado[] misEmpleados= new Empleado[5];
		
		misEmpleados[0]=e;
		misEmpleados[1]=j;
		misEmpleados[2]=new Empleado("empleado", 10000);
		misEmpleados[3]=new Jefe ("jefazo", 10000, 2000);
		misEmpleados[4]=new Empleado ("prox jefe", 10000);
		
		//casting (sacamos un elementos del array y lo transformamos en jefe, 
		//ya que no podemos aplicar el incentivo si el objeto está dentro del array ya que este 
		//es de empleados, pero podemos sacar un objeto, darle el incentivo y volver a meterlo)
		Empleado e1 = misEmpleados[4];
		
		//e1=(Empleado) misEmpleados;
		//jefeFinanzas.setIncentivo(2000);
		//misEmpleados[4]=jefeFinanzas;
		

		for (Empleado p:misEmpleados) {
			p.subirSueldo(10);
			System.out.println(p.toString());
		}
		//cuando es empleado coje el get sueldo de empleado y cuando es jefe el del jefe
		for(Empleado p:misEmpleados) {
			System.out.println(p.getSueldo());
		}
		
		
		
		
		System.out.println(e.toString());
		System.out.println(j.toString());
		
		j.setSección("TIC");
		System.out.println(j.toString());
	}

}

