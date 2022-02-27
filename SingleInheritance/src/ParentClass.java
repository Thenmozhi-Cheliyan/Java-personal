
public class ParentClass 
{
	float square,sum;
	int same;
	 void test()
	{
		System.out.println("______METHOD OVERLOADING______");
	}
	 void test(float a)
	{
		 square=a*a;
	}
	 void test(float a,float b)
	{
		sum=a+b;
	}
	 void test(int c)
	{
		same=c;
	}
}
