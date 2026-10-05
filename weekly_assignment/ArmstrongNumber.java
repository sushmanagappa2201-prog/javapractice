//Write a Java program to check whether a number is an Armstrong number using loops.

package weekly_assignment;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=153;
		int originalNum=num;
		int armstrong=0;
		for(;num>0;)
		{
			int lastDigit=num%10;
			armstrong=armstrong+lastDigit*lastDigit*lastDigit;
			num=num/10;
		}
		System.out.println(armstrong);
		if(originalNum==armstrong)
			System.out.println("it is a armstrong number");
		else
			System.out.println("it is not an armstrong number");
		
			
		
		

	}

}
