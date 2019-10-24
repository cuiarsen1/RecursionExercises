
public class Question7 {
	
	public static void Palindrome(String s)
	{
		int length = s.length();
		
		if (length <= 1)
			System.out.println("Is a Palindrome");
		
		else if (s.charAt(0) == (s.charAt(length - 1)))
		{
			String s2 = s.substring(1, length - 1);
			Palindrome(s2);
		}
		
		else
			System.out.println("Isn't a Palindrome");
	}

	public static void main(String[] args) {

		Palindrome("yrekabakery");

	}

}
