import java.util.*;
public class SingleInheritanceDemo 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		float a,b;
		int c;
		ChildClass child=new ChildClass();
		
		System.out.print("a = ");
		a=s.nextFloat();
		System.out.print("b = ");
		b=s.nextFloat();
		System.out.print("c = ");
		c=s.nextInt();
		
		child.test();
		child.test(a);
		child.test(a,b);
		child.test(c);
		child.Print_Values();
		
		s.close();
	}
}

/*	OUTPUT
 a = 2.5
b = 5.6
c = 5
______METHOD OVERLOADING______
Square Value a^2 = 6.25
Sum Value a+b = 8.1
Same c = 5
*/
