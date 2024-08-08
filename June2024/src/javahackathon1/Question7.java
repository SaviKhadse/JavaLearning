//What are different ways to create String Object?

package javahackathon1;

public class Question7 {

	public static void main(String[] args) {
		String str = new String("Hello1");
		String str1 = "Hello2";
		StringBuffer str3 = new StringBuffer("Hello3");
		StringBuilder str2= new StringBuilder();
		str2.append("World");
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str3);
		System.out.println(str2);
	}

}
