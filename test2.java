import java.util.Scanner;
public class test2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the range print the series:");
		int n = input.nextInt();
		int a=0, b=1;
		for (int i=0;i<n;i++)
		{
			System.out.print(a+ "\t");
			if (i%10==0)
			System.out.println();
			int c=a;
			a=a+b;
			b=c;
		}
		System.out.println();
	}
}
