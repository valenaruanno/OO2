package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class TipoJuridica extends Cliente{

	public double calcularDescuento (){
		return 0.15;
	}
	
	@Override
	public void crearCliente(String nombre, String data, String tel) {
		this.setNombre(nombre);
		this.setNumeroTelefono(tel);
		this.setCuit(data);
	}

}
