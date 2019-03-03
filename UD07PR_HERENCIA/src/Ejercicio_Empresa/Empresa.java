package Ejercicio_Empresa;

import java.util.Arrays;

public class Empresa {
	 String nombre;
	 int tamaño ;
	 Empleado[] arrayEmpleado;
	
	 
	 
	 public Empresa(String n, int limite) {
		 this.nombre=n;
		 this.tamaño=0;
		 arrayEmpleado= new Empleado [limite];
		 
	 }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
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
		for (int i=s;i<this.tamaño;i++) {
			this.arrayEmpleado[s]=this.arrayEmpleado[s+1];
		}
		
		this.tamaño=this.tamaño-1;
		this.arrayEmpleado[tamaño]=null;
		
	}

	public void añadirEmpleado (Empleado e) {
		this.arrayEmpleado[this.tamaño]=e;
		this.tamaño++;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", tamaño=" + tamaño + ", arrayEmpleado=" + Arrays.toString(arrayEmpleado)
				+ "]";
	}

	

		
}
