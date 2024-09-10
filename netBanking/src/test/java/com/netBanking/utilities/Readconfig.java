package com.netBanking.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	Properties prop;
	public Readconfig() {
		try {
			String File ="./Configuration/config.properties";
			FileInputStream src= new FileInputStream(File);
			prop= new Properties();
			prop.load(src);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	public String geturl() {
		return prop.getProperty("url");
	}



}
