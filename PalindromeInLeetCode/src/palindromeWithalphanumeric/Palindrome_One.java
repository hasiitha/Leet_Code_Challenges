package palindromeWithalphanumeric;

import java.io.Console;

public class Palindrome_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abb";

		System.out.println("Is a Palindrome"+IsPalindrome(str));
		
	}




	public static boolean IsPalindrome(String str) {
		str =	str.toLowerCase();
		
		str = str.replaceAll("[^a-z0-9]","");
		
		
		System.out.println(str);
		char arr[] = new char[str.length()];
		
		arr = str.toCharArray();
		
		
		int index_first = 0;
		int index_last = arr.length-1;
		boolean isPalindrome = true ;
		for(int i =0;i<arr.length/2;i++) {
			
			//System.out.println(arr[index_first] +"=="+arr[index_last]+"="+(arr[index_first] != arr[index_last]));
			
			
			if(arr[index_first] != arr[index_last]) {
				isPalindrome =false;
			}
			index_first ++;
			index_last --;
			
			
		}
		return isPalindrome;
		
		
	}	




}

