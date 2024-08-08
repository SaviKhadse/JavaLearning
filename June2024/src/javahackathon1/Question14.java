//Given a string print the reverse of the words string.(Input: Java Code Output: Code Java)

package javahackathon1;

public class Question14 {

	public static void main(String[] args) {
		String str=new String("Java Code");
		String[] newstr=str.split(" ");
		
		StringBuilder sb = new StringBuilder();
        for (int i = newstr.length - 1; i >= 0; i--) {
            sb.append(newstr[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}
			

