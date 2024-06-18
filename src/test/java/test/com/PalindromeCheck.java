package test.com;

public class PalindromeCheck {

	public static void main(String[] args) {

     String inp = "rotator";
     
     System.out.println("Palindrome check: " +checkPalindrome(inp));

	}
	public static Boolean checkPalindrome(String str)
	
	{
		
		//Calculate length of String
		int len = str.length();
		
		// 2 loops -> First to start from first index of string and 
		//second to traverse from end of string
		
	     int i =0,j=len-1;
	     
	     while(i<j)
	     {
	    	 if(str.charAt(i)!=str.charAt(j))
	    		 return false;
	    	 
	    	 i++;
	    	 j--;
	    	 
	     }
	     
	     return true;
		
		
		
		
	}

}
