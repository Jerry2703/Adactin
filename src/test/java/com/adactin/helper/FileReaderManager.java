package com.adactin.helper;

public class FileReaderManager {
	
	private FileReaderManager() {
		// restricting object creation
	}

	public static FileReaderManager getInstance() {
		FileReaderManager helper = new FileReaderManager();
		return helper;
	}

	public ConfigurationReader getInstanceCR() throws Throwable {
		ConfigurationReader reader = new ConfigurationReader();

		return reader;
	}

}
