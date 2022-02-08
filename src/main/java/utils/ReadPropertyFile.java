package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {
	static Properties prop=new Properties();

	public static Properties getPropertyObject() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("D://Akhila//Workspace//LiveProject//buffaloCartERP//src//main//resources//config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public static String getURL()
	{
		return getPropertyObject().getProperty("url");
	}
	
	public static String getUserName()
	{
		return getPropertyObject().getProperty("username");
	}
	public static String getPassword()
	{
		return getPropertyObject().getProperty("password");
	}

}
