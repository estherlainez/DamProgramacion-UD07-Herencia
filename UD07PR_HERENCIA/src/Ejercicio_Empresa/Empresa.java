package Ejercicio_Empresa;

import java.util.Arrays;

public class Empresa {
	 String nombre;
	 int tama�o ;
	 Empleado[] arrayEmpleado;
	
	 
	 
	 public Empresa(String n, int limite) {
		 this.nombre=n;
		 this.tama�o=0;
		 arrayEmpleado= new Empleado [limite];
		 
	 }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
	
	public void setArrayEmpleados(Empresa[] arrayEmpleados) {
		this.arrayEmpleado = arrayEmpleado;
	}

	
	public Empleado getEmpleado(int num){
		Empleado em=this.arrayEmpleado[num];
		return em;
	 }
	 
	
	public void despideEmpleado(int s) {
		this.arrayEmpleado[s]=null;
		for (int i=s;i<this.tama�o;i++) {
			this.arrayEmpleado[s]=this.arrayEmpleado[s+1];
		}
		
		this.tama�o=this.tama�o-1;
		this.arrayEmpleado[tama�o]=null;
		
	}

	public void a�adirEmpleado (Empleado e) {
		this.arrayEmpleado[this.tama�o]=e;
		this.tama�o++;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", tama�o=" + tama�o + ", arrayEmpleado=" + Arrays.toString(arrayEmpleado)
				+ "]";
	}

		
}
