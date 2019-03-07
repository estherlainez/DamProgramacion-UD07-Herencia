package EXAMEN_Evaluacion;

public class Intercambio extends Estudiante{

	String nif;
	String pais;
	double horasAño;
	private int cod;
	private static int codigo;
	
	public Intercambio(String n, String d,double h,int e,String p) {
		super(n, d,h,e);
		this.nif=n;
		this.edad=e;
		this.pais=p;
		this.cod=codigo;
		codigo++;
	}
	
	@Override
	public double CalcularHoras(int horas) {
		double horasAño=horas*5*10;
		return horasAño;
		
	}

	@Override
	public String toString() {
		return super.toString()+"Intercambio [nif=" + nif + ", pais=" + pais + ", horasAño=" + horasAño + ", cod=" + cod + "]\n";
	}
	
}
