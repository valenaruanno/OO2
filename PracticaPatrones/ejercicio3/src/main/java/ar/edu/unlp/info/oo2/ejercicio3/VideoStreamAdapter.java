package ar.edu.unlp.info.oo2.ejercicio3;

public class VideoStreamAdapter extends Media{
	private VideoStream videoStream;
	
	public VideoStreamAdapter (VideoStream videoStream) {
		this.videoStream = videoStream;
	}
	
	@Override
	public void play() {
		this.videoStream.reproduce();
	}

}
