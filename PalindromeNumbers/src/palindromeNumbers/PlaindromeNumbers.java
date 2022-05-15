package palindromeNumbers;



public class PlaindromeNumbers {

	public static void main(String[] args) {
	
		
		System.out.println(	palindromeCheck(0));
	
	
	
	}
		
		
		
		
		
	
	

	
	public static boolean palindromeCheck(int x) {
		int reverse = 0;
		int number = x;
		while(x>0) {
			int lastdigit = x %10;
			reverse =  reverse * 10 + lastdigit;
			x = x /10;
		}
		
		System.out.println(number +"=="+reverse);
		if(number == reverse) {
			return true;
		
		}else {
			return false;
		}
		
	}

}
