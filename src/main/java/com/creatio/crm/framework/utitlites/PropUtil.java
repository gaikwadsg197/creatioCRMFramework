package com.creatio.crm.framework.utitlites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	
	
	/**
	 * Utility class for handling property files.
	 * Provides methods to read data from `.properties` files and load them into a {@link Properties} object.
	 */
	
	public static Properties readData(String fileName)
	{
		Properties prop = new Properties();
		
		try {
			FileInputStream fis= new FileInputStream (System.getProperty("user.dir")+"\\Config\\" + fileName);
		}
		catch (FileNotFoundException e){
		    // Print stack trace if the file is not found
            e.printStackTrace();
        } catch (IOException e) {
            // Print stack trace if an I/O error occurs
            e.printStackTrace();
        }

        return prop;
			
		}
	}

