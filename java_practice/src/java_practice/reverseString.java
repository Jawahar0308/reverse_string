package java_practice;

public class reverseString {
	
	public static String reverse(String name) {
		String rev = "";
		char ch;
		int len = name.length();
		for(int i=0;i<len;i++) {
			ch = name.charAt(i);
			rev = ch+rev;
		}
		
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("Jawahar"));
	}

}
