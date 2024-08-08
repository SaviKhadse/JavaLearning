//Given a string print the unique words of the string.

package javahackathon1;

public class Question15 {

	public static void main(String[] args) {
		String str = "welcome to java coding session, explore to learn coding in java.";
		findUniqueWords(str);
	}
	
	
public static void findUniqueWords(String str) {
	int count;
	
	String[] words = str.split("\\W"); //to split words
	
	for(int i=0; i<words.length; i++) {
		count=1;
		for (int j = i + 1; j < words.length; j++) {
			if(words[i].equalsIgnoreCase(words[j])){
				count++;
				
				words[j]="";
			
			}
		}
		if(count == 1 && words[i] !="") {
				System.out.println(words[i]);
			}
		
		}
	}	

}






