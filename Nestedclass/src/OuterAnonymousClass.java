
public class OuterAnonymousClass
{
	int a=1;
	void outer()
	{
		System.out.println("Outer Method");
		System.out.println(a);
	}
	
	static OuterAnonymousClass out=new OuterAnonymousClass()
			{
				static int b=2;
				void outer()
				{
					super.outer();
					System.out.println("Inside Anonymous Class");
					System.out.println(b);
				}
				
			};
	public static void main(String[] args)
	{
		out.outer();
		//OuterAnonymousClass.anonymous();

	}
}

/*	OUTPUT
 
 Outer Method
1
Inside Anonymous Class
2

*/