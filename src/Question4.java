
public class Question4 {
	
	public static void countBackwards(int n)
	{
		if (n == 1)
		{
			System.out.print(n);
		}
		
		else
		{
			System.out.print(n + ", ");
			countBackwards(n - 1);
		}
	}

	public static void main(String[] args) {

		countBackwards(10);
	}

}
