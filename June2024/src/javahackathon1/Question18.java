//WJP to display duplicate character in string
package javahackathon1;

public class Question18 {

	public static void main(String[] args) {
		String str = "Welcome to June Java Session";
		dupliacteCharacterCount(str);
	
	}
	
public static void dupliacteCharacterCount(String str) {
	
	str = str.toLowerCase();
	char[] ch = str.toCharArray();
	System.out.println("The dupliacte characters are: ");
	for(int i=0; i<ch.length; i++) {
		int count=1;
		char ch1 = ch[i];

			for(int j=i+1; j< ch.length; j++) {
				
				if(ch1==ch[j]) {
					count++;
				ch[j]='\0';
				}
			}
			
			if(count>1 && ch1 != '\0') {
				System.out.println(ch1);
		}

	}
}

}
