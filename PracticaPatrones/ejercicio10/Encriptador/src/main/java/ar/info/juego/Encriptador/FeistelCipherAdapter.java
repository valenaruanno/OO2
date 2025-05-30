package ar.info.juego.Encriptador;

public class FeistelCipherAdapter extends Strategy{
	private FeistelCipher feistelCipher;
	
	public FeistelCipherAdapter (FeistelCipher f) {
		this.feistelCipher = f;
	}
	
	@Override
	public void encrypt(String message) {
		this.feistelCipher.encode(message);
		
	}

	@Override
	public void descript(String message) {
		this.feistelCipher.encode(message);
	}

}
