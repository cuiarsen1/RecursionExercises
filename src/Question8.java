
public class Question8 {
	
	public static int GCD(int n1, int n2)
	{
		if (n2 > n1)
		{
			int tempBig = n2;
			int tempSmall = n1;
			
			n1 = tempBig;
			n2 = tempSmall;
		}
		
		if (n1 % n2 == 0)
			return n2;
		
		else if (n1 % n2 == 1)
			return 1;
		
		else
			return GCD(n2, n1 % n2);
	}

	public static void main(String[] args) {

		System.out.println(GCD(100, 2));

	}

}
