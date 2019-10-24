public class Question2 {
	
	public static void printBackwards(int n)
	{
		String s = Integer.toString(n);
		
		if (s.length() == 1)
			System.out.print(s);
		
		else
		{
			System.out.print(s.charAt(s.length() - 1));
			printBackwards(n/10);
		}
		
	}

	public static void main(String[] args) {

		printBackwards(1234);

	}

}
