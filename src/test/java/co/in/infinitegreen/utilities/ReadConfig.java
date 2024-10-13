package co.in.infinitegreen.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig 
{
	Properties properties;
	
	String path = "C:\\Users\\shubh\\Documents\\Eclipse\\infinitegreen\\configuration\\config.properties";
	
	public ReadConfig() 
	{
		try 
		{
	
		properties = new Properties();
		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

	public String getBaseUrl() 
	{
		String value = properties.getProperty("baseUrl");
		if (value!=null) 
			return value;
					else 
						throw new RuntimeException("Url not found in Config file");
						
					
		}
	
    public String getBrowser() 
    {
		 String value = properties.getProperty("browser");
    	if (value!=null)
    		return value;
    	else
    		throw new RuntimeException("browser not found in Config File");
		
	}
    
	}




