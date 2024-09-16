package java_practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=545;
			int v;
			int sum = 0;
			
			int temp = n;
			
			while(temp>0) {
				v = temp%10;
				sum = (sum*10)+v;
				temp = temp/10;
			}
			
			if(sum == n) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
	}

}
