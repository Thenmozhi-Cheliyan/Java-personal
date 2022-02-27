
public class OuterStaticClass
{
	int a=1;
	void getOuter()	
	{
		System.out.println("This is OUTER CLASS METHOD");
		System.out.println("Outer a="+a);
	}
	
	
	static class InnerClass
	{
		static int b=2;
		static void getInner()
		{
			
			System.out.println("This is INNER CLASS METHOD");
			System.out.println("Inner b="+b);
		//	System.out.println("Outer a called inside inner class:"+a);	
		}
	}

	public static void main(String[] args) 
	{
		OuterStaticClass out=new OuterStaticClass();
		out.getOuter();
		InnerClass.getInner();

	}
}

/*
 This is OUTER CLASS METHOD
Outer a=1
This is INNER CLASS METHOD
Inner b=2
*/