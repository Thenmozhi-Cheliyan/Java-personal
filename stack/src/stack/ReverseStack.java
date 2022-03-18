package stack;
import java.util.*;
public class ReverseStack 
{
	
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string to be reversed : ");
		String line=s.nextLine();
		StringBuilder reversedLine=new StringBuilder();
		Stack<Character> stack=new Stack<Character>();
		s.close();
		for(int i=0;i<line.length();i++)
		{
			stack.push(line.charAt(i));
		}
		System.out.println("The characters in stack "+stack);
		System.out.println("The total elements in stack are "+stack.size());
		System.out.println("The element at 3rd position in the stack is "+stack.elementAt(2));
		//stack.removeElementAt(1);
		//System.out.println("Final stack elements "+stack);
		while(!stack.isEmpty())
		{
			reversedLine.append(stack.pop());
		}
		System.out.println("The reversed string is "+reversedLine);
	}
}
