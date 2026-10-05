//Write a Java program to reverse a given number using a loop.

package weekly_assignment;

public class ReverseaNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number=12345;
		int reversedNumber = 0;
		for (; number != 0; number /= 10) {
		    int lastDigit = number % 10;
		    reversedNumber = reversedNumber * 10 + lastDigit;
		    
		}
		System.out.println(+reversedNumber);

	}

}
