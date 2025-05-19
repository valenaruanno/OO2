package ar.edu.info.oo2.filtros.imageFilters;

public class Monochrome extends Filter{
	public BufferedImage filter(BufferedImage image) {
		int pixel = image.getRGB(x, y);
		int alpha = (pixel >> 24) & 0xff;
		int red = (pixel >> 16) & 0xff;
		int green = (pixel >> 8) & 0xff;
		int blue = pixel & 0xff;

		int avg = (red + green + blue) / 3;
		pixel = (alpha << 24) | (avg << 16) | (avg << 8) | avg;
		image.setRGB(x, y, pixel); 
		
		return image;
	  }
}
