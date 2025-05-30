package ar.info.juego.Encriptador;

public class RC4Adapter extends Strategy{
	private RC4 rc4;
	private String key;
	
	public RC4Adapter (RC4 rc4, String key) {
		this.rc4 = rc4;
		this.key = key;
	}
	
	@Override
	public void encrypt(String message) {
		this.rc4.encriptar(message, key);
		
	}

	@Override
	public void descript(String message) {
		this.rc4.desencriptar(message, key);
		
	}
	
	
	
}
