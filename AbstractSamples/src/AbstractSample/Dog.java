package AbstractSample;
	public class Dog extends Animal
	{
		protected void display()
		{
			System.out.println("***************DOG***************");
		//	System.out.println("a in animal="+a); //works as it is declared as public
		//	System.out.println("b="+b); //doesnt works bcoz declared as private
		//	System.out.println("c="+c);//works declared protected...it can be used in child classes
		}
		public void sound()
		{
			System.out.println("Dog Barks");
		}
		public void youngOnes()
		{
			System.out.println("Young one - Puppy");
		}
		public void domesticOrWild()
		{
		System.out.println("Dog is a Domestic animal");
		}
	}


