import java.util.*;
public class DemoException 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int choice;
		char exp;
		System.out.println("********************************************");
		System.out.println("(1) ARITHMETIC EXCEPTION");
		System.out.println("(2) NULL POINTER EXCEPTION");
		System.out.println("(3) NUMBER FORMAT EXCEPTION");
		System.out.println("(4) ARRAY INDEX OUT OF BOUNDS EXCEPTION");
		System.out.println("(5) NEGATIVE ARRAY EXCEPTION");
		System.out.println("*******************************************");
		
		
		do
		{
		System.out.println("Enter your choice to be Excecuted: ");
		choice=scan.nextInt();
		
		// Start of custom exception
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
		}	// End of custom exception
		finally
		{
			System.out.println("FINALLY WILL BE EXECUTED ALWAYS");
		}

		try
		{
			
			switch(choice)
			{
			case 1:
				int a,b,c;
				System.out.print("a = ");
				a=scan.nextInt();
				System.out.print("b = ");
				b=scan.nextInt();
				c=a/b;
				System.out.println("Successfully Executed......No Exceptions found");
				System.out.println("c = "+c);
			break;
			
			case 2:
				scan.nextLine();
				String str=null;
				System.out.println("String Length = "+str.length());
			break;
			
			case 3:
				String string;
				System.out.println("Enter your Age in Words: ");
				string=scan.next();
				Integer.parseInt(string);
				System.out.println("Successfully Executed.....No Exceptions Found");
				System.out.println("Your Age is :"+string);
			break;
			
			case 4:
				int n;
				System.out.println("Enter array length : ");
				n=scan.nextInt();
				int arr[]=new int[n];
				arr[0]=1;
				System.out.println("1st ELEMENT = "+arr[0]);
				arr[n+3]=2;
				System.out.println("n+3 ELEMENT = "+arr[n+3]);
				break;
			case 5:
				int arr1[]=new int[-5];
				System.out.println("The length of the array is "+arr1.length);
				break;
			}
		
		}

		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Cannot print the length value for which it is defined null");
			System.out.println("Please enter a valid format to find length");
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			System.out.println("Please enter the value in integer");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Number cannot be divided by zero");
			System.out.println("Please enter valid values for a and b");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Element cannot be inserted at the specified index");
		}
		catch(NegativeArraySizeException e)
		{
			e.printStackTrace();
			System.out.println("Array Size cannot be negative");
			System.out.println("Please give a positive array size");
		}
		
		System.out.println("Do you want to continue(y/n)??");
		exp=scan.next().charAt(0);
		}
		
		while(exp=='y');
	
		System.out.println("_________*______End of Execution____*_______*_______");
		
		scan.close();
		
		}
	
}


/*	OUTPUT
 ********************************************
(1) ARITHMETIC EXCEPTION
(2) NULL POINTER EXCEPTION
(3) NUMBER FORMAT EXCEPTION
(4) ARRAY INDEX OUT OF BOUNDS EXCEPTION
(5) NEGATIVE ARRAY EXCEPTION
*******************************************
Enter your choice to be Excecuted: 
1
FINALLY WILL BE EXECUTED ALWAYS
a = 12
b = 8
Successfully Executed......No Exceptions found
c = 1
Do you want to continue(y/n)??
y
Enter your choice to be Excecuted: 
2
FINALLY WILL BE EXECUTED ALWAYS
java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
Cannot print the length value for which it is defined null
Please enter a valid format to find length
Do you want to continue(y/n)??
	at DemoException.main(DemoException.java:59)
y
Enter your choice to be Excecuted: 
3
FINALLY WILL BE EXECUTED ALWAYS
Enter your Age in Words: 
ten
java.lang.NumberFormatException: For input string: "ten"
Please enter the value in integer
Do you want to continue(y/n)??
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at DemoException.main(DemoException.java:66)
y
Enter your choice to be Excecuted: 
3
FINALLY WILL BE EXECUTED ALWAYS
Enter your Age in Words: 
12
Successfully Executed.....No Exceptions Found
Your Age is :12
Do you want to continue(y/n)??
y
Enter your choice to be Excecuted: 
4
FINALLY WILL BE EXECUTED ALWAYS
Enter array length : 
6
1st ELEMENT = 1
java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 6
	at DemoException.main(DemoException.java:78)
Element cannot be inserted at the specified index
Do you want to continue(y/n)??
y
Enter your choice to be Excecuted: 
5
FINALLY WILL BE EXECUTED ALWAYS
java.lang.NegativeArraySizeException: -5
Array Size cannot be negative
Please give a positive array size
Do you want to continue(y/n)??
	at DemoException.main(DemoException.java:82)
n
_________*______End of Execution____*_______*_______

 */

