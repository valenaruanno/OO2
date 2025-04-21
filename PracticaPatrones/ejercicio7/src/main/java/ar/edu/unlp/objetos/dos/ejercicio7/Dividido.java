package ar.edu.unlp.objetos.dos.ejercicio7;

public class Dividido implements Operacion{
	@Override
	public double resolver(Calculadora calculadora, double operando2) {
		if (operando2 == 0)
			calculadora.setEstado(new Error());
		return calculadora.getValorAcumulado() / operando2;
	}
}
