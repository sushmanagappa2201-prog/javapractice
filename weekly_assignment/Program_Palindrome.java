package weekly_assignment;

public class Program_Palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=131;
		int original=num;
		int reverse=0;
		int count=0;
		for(;num>0;)
		{
		int lastDigit=num%10;
		reverse=reverse*10+lastDigit;
		num=num/10;
		count++;
		}
		System.out.println("Reverse:"+reverse);
		if(original==reverse)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		
		

	}

}
