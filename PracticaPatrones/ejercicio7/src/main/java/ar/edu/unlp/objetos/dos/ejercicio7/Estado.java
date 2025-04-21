package ar.edu.unlp.objetos.dos.ejercicio7;

public abstract class Estado {
	
	protected Operacion operacion;
	
	public Estado () {
		
	}
	
	public Operacion getOperacion() {
		return operacion;
	}

	public String getResultado(Calculadora calculadora) {
		return calculadora.getValorAcumulado() + "";
	}
	
	public void borrar (Calculadora calculadora) {
		calculadora.setValorAcumulado(0);
		calculadora.setEstado(new Inicial());
	}
	
	public abstract void setValor (Calculadora calculadora, double unValor);
	
	public void mas(Calculadora calculadora) {
		calculadora.setEstado(new Resolviendo(new Mas()));
	}
	
	public void menos(Calculadora calculadora) {
		calculadora.setEstado(new Resolviendo(new Menos()));
	}
	
	public void dividido(Calculadora calculadora) {
		calculadora.setEstado(new Resolviendo(new Dividido()));
	}
	
	public void por(Calculadora calculadora) {
		calculadora.setEstado(new Resolviendo(new Por()));
	}
}
