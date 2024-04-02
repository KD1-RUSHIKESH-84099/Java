import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = input.nextInt();
		System.out.println("Binary Equivalent" + "-" + Integer.toBinaryString(n));
		System.out.println("Octal Equivalent" + "-" + Integer.toOctalString(n));
		System.out.println("Hexadecimal Equivalent" + "-" + Integer.toHexString(n));
		
		
		}

}
