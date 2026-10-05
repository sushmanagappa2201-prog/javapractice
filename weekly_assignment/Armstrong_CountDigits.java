package weekly_assignment;

public class Armstrong_CountDigits {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=8459,original=num;
		int noofDigits=0;
		int armstrong=0;
		
		for(;num>0;)
		{
			noofDigits++;
			num=num/10;
		}
		num=original;
		for(;num>0;)
		{
			int lastDigit=num%10;
			int multiply=1;
			for(int i=1;i<=noofDigits;i++)
			{
				multiply=multiply*lastDigit;
			}
			armstrong=armstrong+multiply;
			num=num/10;
			
		}
		System.out.println("armstrong result:"+armstrong);
		if(original==armstrong)
			System.out.println("it is a armstrong number");
		else
			System.out.println("it is not an armstrong number");
		
	}

}
