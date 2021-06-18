package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;

	public ConfigurationReader() throws Throwable {

		File f = new File("C:\\Users\\jerol\\eclipse-workspace\\automationpractice\\src\\test\\java\\com\\adactin\\configurationproperties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(fis);

	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

}
