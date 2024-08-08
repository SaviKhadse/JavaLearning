//Write a method to implement *, - , / operations. You should use only the + operator
package javahackathon1;
public class Question34 {
	public static void main(String[] args) {
		int a = 10;
        int b = 2;
        System.out.println("Multiplication of a and b is: " + multiply(a, b));
        System.out.println("Subtraction of a and b is: " + subtract(a, b));
        System.out.println("Division of a and b is: " + divide(a, b));
	}
	public static int negate(int num) {
        int neg = 0;
        int newNum = num < 0 ? 1 : -1;
        while (num != 0) {
            neg += newNum;
            num += newNum;
        }
        return neg;
    }
	public static int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        int result = 0; 
        boolean negativeTrue = (a < 0 && b > 0) || (a > 0 && b < 0);
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return negativeTrue ? negate(result) : result;
    }
	public static int subtract(int a, int b) {
        return a + negate(b);
    }
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (a == 0) {
            return 0;
        }
        int result = 0;
        boolean negative = (a < 0 && b > 0) || (a > 0 && b < 0);
        while (a >= b) {
            a = subtract(a, b);
            result++;
        }
        return negative ? negate(result) : result;
    }
}