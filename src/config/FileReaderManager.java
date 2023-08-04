package config;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {

	}

	

	public ConfigurationReader getInstanceCR() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}

	


	public static FileReaderManager getInstanceFRM() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
 
}


