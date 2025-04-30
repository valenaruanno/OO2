package ar.edu.unlp.info.oo2.ejercicio13;

public class Director {
	private Builder builder;
	
	public Director (Builder builder) {
		this.builder = builder;
	}
	
	
	public Builder getBuilder() {
		return builder;
	}


	public void construirClasico (String pan, String aderezo, String principal, String adicional) {
		this.builder.crearSandwich();
		this.builder.addPan(pan, 100);
		this.builder.addAderezo(aderezo, 20);
		this.builder.addPrincipal(principal, 300);
		this.builder.addAdicional(adicional, 80);
	}
	
	public void construirVegetariano (String pan, String principal, String adicional) {
		this.builder.crearSandwich();
		this.builder.addPan(pan, 120);
		this.builder.addPrincipal(principal, 200);
		this.builder.addAdicional(adicional, 100);
	}
	
	public void construirVegano (String pan, String aderezo, String principal) {
		this.builder.crearSandwich();
		this.builder.addPan(pan, 100);
		this.builder.addAderezo(aderezo, 20);
		this.builder.addPrincipal(principal, 500);
	}
	
	public void construirSinTACC (String pan, String aderezo, String principal, String adicional) {
		this.builder.crearSandwich();
		this.builder.addPan(pan, 150);
		this.builder.addAderezo(aderezo, 18);
		this.builder.addPrincipal(principal, 250);
		this.builder.addAdicional(adicional, 200);
	}
}
