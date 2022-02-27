
public class OuterClass
{
	int a=1;
	void getOuter()	
	{
		System.out.println("This is OUTER CLASS METHOD");
		System.out.println("Outer a="+a);
	}
	
	//	INNER CLASS
	public class InnerClass
	{
		int b=2;
		void getInner()
		{
			System.out.println("This is INNER CLASS METHOD");
			System.out.println("Inner b="+b);
			System.out.println("Outer a called inside inner class:"+a);	
		}
	}	
	public static void main(String[] args)
	{
		OuterClass out=new OuterClass();
		InnerClass in= out.new InnerClass();
		out.getOuter();
		in.getInner();
	}
}

/*	OUTPUT
This is OUTER CLASS METHOD
Outer a=1
This is INNER CLASS METHOD
Inner b=2
Outer a called inside inner class:1
	 */
