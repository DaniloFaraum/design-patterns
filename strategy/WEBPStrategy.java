package strategy;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;

public class WEBPStrategy {
	@Override
		public File convert(File input, String output) {
		try {
		BufferedImage image = ImageIO.read(input);
		
		ImageWriter writer = ImageIO
				.getImageWritersByMIMEType("image/webp")
				.next();
				
		WebPWriteParam writeParam = new WebPWriteParam(writer.getLocale())
				writeParam.setCompressionMode(ImageWriterParam.MODE_EXPLICIT)
				writeParam.setCompressionType(writeParam.getCompressionTypes()[WebPWriteParam.LOSSY_COMPRESSION]);
		writeParam.setcompressionQuality(0.05f);
		
		File webp = new File(output);
		writer.setOutput(FileImageOutputStream(webp));
		writer.write(null, new IIOmage(image, null, null), writeParam);
		return webp;
		} catch (Exception e) {
			e.printStacTrace();
			return null;
		}
	}
}
