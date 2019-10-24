public class Question3 {
	
	public static void countForwards(int n)
	{
		if (n == 1)
			System.out.print(n);
		
		else
		{
			countForwards(n - 1);
			System.out.print(", " + n);
		}
	}

	public static void main(String[] args) {

		countForwards(10);
	}

}
