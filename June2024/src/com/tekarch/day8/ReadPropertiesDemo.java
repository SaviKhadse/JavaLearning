package com.tekarch.day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesDemo {

	public static void main(String[] args) throws IOException {
		File file= new File("/src/Files/data.properties");
		Properties propfile=new Properties();
		FileInputStream fi = new FileInputStream(file);
		propfile.load(fi);
		
		String name= propfile.getProperty("name");
		System.out.println("name=>"+name);
		String age= propfile.getProperty("age");
		System.out.println("age=>"+age);
		String username= propfile.getProperty("username");
		System.out.println("username=>"+username);
		
//		Writing into properties file
		propfile.setProperty("grade", "12");
		FileOutputStream fo = new FileOutputStream(file);
		propfile.store(fo,"adding new property with value" );
		
		fi.close();
		fo.close();
		

	}

}
