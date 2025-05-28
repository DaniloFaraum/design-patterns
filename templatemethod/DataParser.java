package templatemethod;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public abstract class DataParser {
	protected String path;
	private List<String> data = new ArrayList<String>();
	private static final Logger LOG = Logger.getLogger(DataParser.class.getName());
	
	public void sanitize() {
		LOG.info("Initializing sanitization function...");
		data = readData();
		data = removeHtml(data);
		data = removeUnsafe(data);
		writeData(data);
		LOG.info("Completed");
	}
	protected List<String> removeUnsafe(List<String> data){
		return data.stream().map(e -> e.replaceAll("[&|\\|\(|\)]", "")).collect(Collectors.toList());
	};
	protected List<String> removeHtml(List<String> data){
		return data.stream().map(DataParser::removeHtml).collect(Collectors.toList());
	};
	private static String removeHtml(String data) {
		return data.stream().map(e -> e.replaceAll("</?\w+(\s\w+="\w+-", "")).collect(Collectors.toList());
	}
	protected abstract List<String> readData();
	protected abstract void writeData(List<String> data);
}
