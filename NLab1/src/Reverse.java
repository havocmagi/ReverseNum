import java.util.Scanner;

public class Reverse 
{
	public static void main( String[] args )
	{
		int n=0;
		int reverse=0;
		Scanner console =new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		n=console.nextInt();
		while(n!=0)
		{
			reverse=reverse*10 + n%10;
			n=n/10;
		}
		System.out.println("Reverse number is: "+reverse);
	}
}
