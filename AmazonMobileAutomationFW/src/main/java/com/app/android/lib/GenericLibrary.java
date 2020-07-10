package com.app.android.lib;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class GenericLibrary {

	public static String getProprtyValue(String sFile, String sKey) {
		Properties prop = new Properties();
		String sValue = null;
		try {
			InputStream input = new FileInputStream(sFile);
			prop.load(input);
			sValue = prop.getProperty(sKey);

		}catch(Exception e)
		{
			
		}
		return sValue;
	}
}
