//Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true.

package javahackathon1;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a = true;
		boolean b = false;
		boolean c = true;
	
		if((a&&b)|| (b&&c)|| (c&&a) ){
			
			System.out.println("Two of the variables are true");
			
		}else
			System.out.println("Less than two variables are true");
	}

	}


