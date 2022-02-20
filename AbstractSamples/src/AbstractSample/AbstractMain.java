package AbstractSample;
public class AbstractMain 
{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.appearance();
		d.display();
		d.sound();
		d.youngOnes();
		d.domesticOrWild();
		Cow c=new Cow();
		c.display();
		c.sound();
		c.youngOnes();
		c.domesticOrWild();
		Lion l=new Lion();
		l.display();
		l.sound();
		l.youngOnes();
		l.domesticOrWild();

	}

}
