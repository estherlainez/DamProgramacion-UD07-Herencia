package EXAMEN_Evaluacion;

public class PersonalGestion extends Persona{

	String posicion;
	String numSS;
	public PersonalGestion(String n, String d, double ho,String num,String p) {
		super(n, d, ho);
		this.numSS=num;
		this.posicion=p;
	}
	@Override
	public double CalcularHoras(int horas) {
		double horasAño=horas*5*11;
		return horasAño;
		
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getNumSS() {
		return numSS;
	}
	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}
	@Override
	public String toString() {
		return super.toString()+"PersonalGestion [posicion=" + posicion + ", numSS=" + numSS + "]\n";
	}
	

}
