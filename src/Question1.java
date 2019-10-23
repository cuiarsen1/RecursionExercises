
public class Question1 {
	
	public static void printAsterisk(int n)
	{
		if (n == 0)
			return;
		
		else 
		{
			printAsterisk(n - 1);
			System.out.print("*");
		}
			
	}

	public static void main(String[] args) {

		printAsterisk(3);

	}

}
