import java.util.*;
public class CustomExceptionDemo
{

	public static void main(String[] args) 
	{
		int choice;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Choice: ");
		choice=s.nextInt();
		
		try
		{
		if(choice>5)
		{
			throw new InvalidChoiceException("This is an invalid choice....Choice should be upto 5 only");
		}
		}
		catch(InvalidChoiceException e)
		{
			System.out.println("Error "+e.getMessage());
		}	
		finally
		{
			System.out.println("FINALLY WILL BE EXECUTED ALWAYS");
		}


	}

}
