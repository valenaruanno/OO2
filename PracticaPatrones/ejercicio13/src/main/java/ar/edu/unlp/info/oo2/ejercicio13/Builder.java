package ar.edu.unlp.info.oo2.ejercicio13;

public interface Builder {

	public void addPan(String pan, int precio);
	public void addAderezo(String aderezo, int precio);
	public void addPrincipal(String principal, int precio);
	public void addAdicional(String adicional, int precio);
	public Sandwich getResult();
	public void crearSandwich();
}
