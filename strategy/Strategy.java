package strategy;

import java.io.File;

public interface Strategy {
	public File convert(File input, String output);
}
