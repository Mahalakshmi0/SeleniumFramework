package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public Properties p;
	public ConfigurationReader() throws IOException
	{
	
	File f= new File ("C:\\Users\\HP\\eclipse-workspace\\webdrivermethod\\src\\config\\configuration.properties");
	FileInputStream fis=new FileInputStream(f);
	p=new Properties();
	p.load(fis);
	}
		public String getUrl()
		{
			String url=p.getProperty("url");
			return url;
		}
	
		public String getUsername()
		{
			String username=p.getProperty("username");
			return username;
		}
		
		public String getPassword()
		{
			String password=p.getProperty("password");
			return password;
			
		}
	
}


