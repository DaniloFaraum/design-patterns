package strategy;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PNGStrategy implements Strategy{
	@Override
	public File convert(File input, String output) {
		BufferedImage image;
		try {
			image = ImageIO.read(input);
			File png = new File(output);
			ImageIO.write(image, "png", png);
			return png;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
