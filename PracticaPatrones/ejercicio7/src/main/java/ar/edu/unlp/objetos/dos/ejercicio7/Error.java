package ar.edu.unlp.objetos.dos.ejercicio7;

public class Error extends Estado{

	@Override
	public String getResultado(Calculadora calculadora) {
		return "Error";
	}

	@Override
	public void setValor(Calculadora calculadora, double unValor) {
			
	}
}
