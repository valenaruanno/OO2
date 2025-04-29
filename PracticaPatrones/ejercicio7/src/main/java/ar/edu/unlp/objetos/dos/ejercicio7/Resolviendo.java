package ar.edu.unlp.objetos.dos.ejercicio7;

public class Resolviendo extends Estado{
	private Operacion operacion;
	
	public Resolviendo (Operacion operacion) {
		this.operacion = operacion;
	}

	@Override
	public void setValor(Calculadora calculadora, double unValor) {
		calculadora.setValorAcumulado(this.operacion.resolver(calculadora, unValor));
	}
	

}
