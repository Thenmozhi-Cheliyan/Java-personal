package AbstractSample;
public abstract class Animal
{
	// public int a=10;
	//private int b=23;//cannot be used in other classes
	//protected int c=56;
	public abstract void sound();
	public abstract void youngOnes();
	public abstract void domesticOrWild();
	public void appearance()
	{
		System.out.println("*********GENERAL************");
		System.out.println("All animals will have 4 legs");
		System.out.println("All animals will have 5 senses");
	
	}
}

