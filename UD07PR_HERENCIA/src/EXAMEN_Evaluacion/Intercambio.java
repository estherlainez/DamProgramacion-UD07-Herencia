package EXAMEN_Evaluacion;

public class Intercambio extends Estudiante{

	String nif;
	String pais;
	double horasA�o;
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
		double horasA�o=horas*5*10;
		return horasA�o;
		
	}

	@Override
	public String toString() {
		return super.toString()+"Intercambio [nif=" + nif + ", pais=" + pais + ", horasA�o=" + horasA�o + ", cod=" + cod + "]\n";
	}
	
}
