package com.helper.com;

public class FileReaderManager {
	
	private FileReaderManager() {
	
	}
	
	public FileReaderManager getInstanceFRM() {
      FileReaderManager frm = new FileReaderManager();
      return frm;
	}
	
	public static ConfigurationReader getInstanceCR() throws Throwable {
      ConfigurationReader cr = new ConfigurationReader();
      return cr;
	}
	
	
}
