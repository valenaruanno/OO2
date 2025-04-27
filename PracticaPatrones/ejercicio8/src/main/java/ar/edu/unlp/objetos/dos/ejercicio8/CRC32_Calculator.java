package ar.edu.unlp.objetos.dos.ejercicio8;
import  java.util.zip.CRC32;
public class CRC32_Calculator implements Calculator {
	private CRC32 crc = new CRC32();
	
	@Override
	public int crcFor(String data) {
		crc.update(data.getBytes());
		return (int) crc.getValue();
	}

}
