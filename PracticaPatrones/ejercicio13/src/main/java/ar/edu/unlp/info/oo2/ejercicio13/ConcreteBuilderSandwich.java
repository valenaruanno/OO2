package ar.edu.unlp.info.oo2.ejercicio13;

public class ConcreteBuilderSandwich implements Builder{
	private Sandwich sandwich;
	
	@Override
	public void crearSandwich() {
		this.sandwich = new Sandwich();
	}
	
	@Override
	public void addPan(String pan, int precio) {
		this.sandwich.setPan(pan);
		this.sandwich.incrementPrecio(precio);
	}

	@Override
	public void addAderezo(String aderezo, int precio) {
		this.sandwich.setAderezo(aderezo);
		this.sandwich.incrementPrecio(precio);
	}

	@Override
	public void addPrincipal(String principal, int precio) {
		this.sandwich.setPrincipal(principal);
		this.sandwich.incrementPrecio(precio);
	}

	@Override
	public void addAdicional(String adicional, int precio) {
		this.sandwich.setAdicional(adicional);
		this.sandwich.incrementPrecio(precio);
	}

	@Override
	public Sandwich getResult() {
		return this.sandwich;
	}

}
