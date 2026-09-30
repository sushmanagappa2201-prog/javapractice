package daily_assignment;

public class TypeCasting {
	//Create a Java program that:
	//1.	Stores 10.75 in a double variable. 
	//2.	Explicitly typecasts it to an int variable. 
	//3.	Prints both values.

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Stores 10.75 in a double variable.
		double v = 10.75;
        
        // 2. Explicitly typecasts it to an int variable.
        int intValue = (int) v;
        
        // 3. Print both values
        System.out.println("Double value: " + v);
        System.out.println("Integer value (after typecasting): " + intValue);

	}

}
