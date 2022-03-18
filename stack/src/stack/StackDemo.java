package stack;
import java.util.*;
public class StackDemo
{
	static int num;
	static Scanner s=new Scanner(System.in);
	
public static void getElements(Stack<Integer> evenstack, Stack<Integer> oddstack)
{	System.out.println("Enter Stack Capacity : ");
	int n=s.nextInt();
	System.out.println("Enter the numbers: ");
	for(int i=1;i<=n;i++)
	{
		num=s.nextInt();
		
		if(num%2==0)
		{
			evenstack.push(num);
		}
		else
		{
			oddstack.push(num);
		}
	}
	System.out.println("Even Stack : "+evenstack);
	System.out.println("Odd Stack : "+oddstack);	
}
public static void stackOperations(Stack<Integer> evenstack, Stack<Integer> oddstack)
{
	evenstack.pop();
	System.out.println("The Even stack After pop  : "+evenstack);
	System.out.println("The item given "+oddstack.search(21));
	System.out.println("The top most element of oddstack is "+oddstack.peek());
	
}
public static void main(String[] args)
{
		// TODO Auto-generated method stub
		Stack<Integer> evenstack=new Stack<Integer>();
		Stack<Integer> oddstack=new Stack<Integer>();
		getElements(evenstack,oddstack);
		stackOperations(evenstack,oddstack);
}
}
