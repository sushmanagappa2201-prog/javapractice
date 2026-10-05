
//Write a Java program to print all even numbers and odd numbers between 1 and 20 using a loop.
package weekly_assignment;

public class EvenorOdd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for (int i = 1; i <= 20; i++) 
		{
            if (i % 2 == 0) 
            { // Checks if the number is perfectly divisible by 2
                System.out.print(i + " ");
                
                
            }
            	
            
            else 
            {
            	System.out.print("\n");
            	System.out.print(i+" ");
            }
            	

	    }
	}
}


