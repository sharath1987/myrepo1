import java.util.Scanner;
public class test2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a=0, b=1;
		for (int i=0;i<n;i++)
		{
			System.out.println(a);
			a=a+i;
		}
	}
}
