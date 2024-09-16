package java_practice;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String word = "hello";
			String reverse = "";
			
			for(int i=0; i<word.length(); i++) {
				reverse = word.charAt(i) + reverse;
			}
			System.out.println(reverse);
	}

}
