
public class SoalUAS4 {
	public static void SoalUAS4mip (int n) 
	{
		int i, j;
		for (i = 0; i <n; i++) {
			for (j = 2*(n-i); j>=1; j--) {
				System.out.print (" ");
			}
			for ( j = 0; j<=i; j++)
			{

				System.out.print(j+ " ");

			}
			System.out.println();
		}
	}

	public static void main(String args[])
	{
		int n = 5;
		SoalUAS4mip (n);
	}

}
