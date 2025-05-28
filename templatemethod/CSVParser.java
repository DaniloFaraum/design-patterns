package templatemethod;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVParser extends DataParser {

	@Override
	protected List<String> readData() {
		List<String> data = new ArrayList<String>();
		File file = new File(path);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				data.add(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	@Override
	protected void writeData(List<String> data) {
		File file = new File(path);
		BufferedWriter writer = new BufferedWriter(new FileWritter(file));
		data.forEach(e -> writer.write(e);
		writer.close();
	}

}
