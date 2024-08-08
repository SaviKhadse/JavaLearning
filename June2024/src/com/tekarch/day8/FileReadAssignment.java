package com.tekarch.day8;	

import java.io.BufferedReader;
import java.io.IOException;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadAssignment {

	public static void main(String[] args) throws IOException {

		// 1. Define the path of the file
		String userDir = System.getProperty("user.dir");

		String filepath = userDir + "/Users/savitakhadse/eclipse-workspace/June2024/Files/file1.txt";

		// 2. Read the file as a Object
		FileReader filereader = new FileReader(filepath);

		// 3. Read this file line by line

		BufferedReader bufferedReader = new BufferedReader(filereader);

		String str;

		while ((str=bufferedReader.readLine()) != null) {
			System.out.println(str);
		}
		bufferedReader.close();
}
}






