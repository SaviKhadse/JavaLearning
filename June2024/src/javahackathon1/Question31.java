//Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)
package javahackathon1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question31 {

	public static void main(String[] args) throws IOException {
		
	String inputFile = "/Users/savitakhadse/eclipse-workspace/June2024/Files/file1.txt";    
    String outputFile = "/Users/savitakhadse/eclipse-workspace/June2024/Files/output.txt"; 
    
    try {
        List<String> lines = readLinesFromFile(inputFile);
        
        Collections.reverse(lines);
        
        writeLinesToFile(lines, outputFile);
       
        
    } catch (IOException e) {
        System.err.println("Error reading or writing file: " + e.getMessage());
    }
}
	
	public static List<String> readLinesFromFile(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
	 public static void writeLinesToFile(List<String> lines, String fileName) throws IOException {
		 
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
				for (String line : lines) {
	                writer.write(line);
	                writer.newLine();
	        }
			}
	    }
	}