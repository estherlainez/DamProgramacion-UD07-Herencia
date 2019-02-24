package EjemploFinal;

public class Empleado {
	private final String nombre;
	/*la variable final se utiliza para que
	 * una vez creado el objeto no se puede modificar
	 * NADA NI NADIE PUEDE MODIFICAR EL VALOR DEL 
	 * ATRIBUTO
	 */
	private String seccion;
	private int id;
	static int IdSiguiente=1;
	/* hacemos que id sea una variable de clase,
	 * es un valor unico y accesible para todos los objetos
	 */
	
	
	public Empleado (String nom) {
		/*vamos a crear un id que da un valor 
		 * a cada uno de los trabajadores
		 * 
		 */
		this.nombre=nom;
		this.seccion="Administracion";
		this.id=IdSiguiente;
		IdSiguiente++;
	}
	
	
	public void setSeccion (String sec) {
		this.seccion=sec;
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", seccion=" + seccion + ", id=" + id + "]";
	}
}

 