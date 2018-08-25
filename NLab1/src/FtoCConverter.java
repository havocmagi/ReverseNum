import java.util.Scanner;
public class FtoCConverter 
{
	public static void main( String[] args )
	{
		double f=0.0;
		double c=0.0;
		Scanner console =new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit: ");
		f=console.nextDouble();
		c=(f-32)*5/9;
		System.out.println("Temperature in Celsius is: " + c);
	}
}
