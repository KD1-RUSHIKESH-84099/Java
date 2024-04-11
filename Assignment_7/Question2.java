import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		String s = input.next();
//		String s1 = s;
		char[] arr = s.toCharArray();
		
		int p = 0, q = s.length() - 1;
		
		while(p < q) {
			
			char temp = arr[p];
			arr[p] = arr[q];
			arr[q] = temp;
			p++;
			q--;
			
			
		}
		String mainn = new String(arr);
		if(s.equals(mainn)) {
			System.out.println("String is palindrome");
			
		}else {
			System.out.println("String is not palindrome");
		}
		
		
		
		

	}

}
