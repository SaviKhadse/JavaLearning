//1. Use the Scanner function for all input for Programming Questions.
//2. For theory questions please type your answers in a single MS Word or Doc File.
//3. Write your code on paper first using pen & then execute the code on Eclipse.
//4. Submit your theory (word file) and Programs from your eclipse in to your google drive "Read-Write" folder(one with your name).

package javahackathon1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class HackathonQue {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String filepath = "/Users/savitakhadse/eclipse-workspace/June2024/Files/file1.txt";
		FileWriter fw = new FileWriter(filepath, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String ans;
		do {
		System.out.println("Do you have question? ");
		ans=sc.nextLine();

		if(ans.equals("y")) {
			System.out.println("Please enter your question: ");
			String que=sc.nextLine();
		
			bw.append(que+"\n");
		}
		
		}while(ans.equals("y"));
		bw.close();
		readQuestionFile();
		sc.close();
		
	}
	public static void readQuestionFile() throws IOException {
		String filepath = "/Users/savitakhadse/eclipse-workspace/June2024/Files/file1.txt";
//		File myFile = new File("userDir"+"./src/Files/file1.txt");
		FileReader fw = new FileReader(filepath);
		BufferedReader br = new BufferedReader(fw);
		int ch;
		System.out.println("Reading from question file");
		while((ch=br.read())!= -1) {

			System.out.print((char)ch);
			
		}
		System.out.println();
//		fw.close();
	}
	
}