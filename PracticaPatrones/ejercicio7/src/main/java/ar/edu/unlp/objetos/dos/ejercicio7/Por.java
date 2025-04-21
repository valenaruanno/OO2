package ar.edu.unlp.objetos.dos.ejercicio7;

public class Por implements Operacion{
	@Override
	public double resolver(Calculadora calculadora, double operando2) {
		return calculadora.getValorAcumulado() * operando2;
	}
}
