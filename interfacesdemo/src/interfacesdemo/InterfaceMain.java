package interfacesdemo;
import java.util.*;
public class InterfaceMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Radius: ");
		double r=s.nextDouble();
		System.out.println("Enter Height: ");
		double h=s.nextDouble();
		
		ImplementationInterface ii=new ImplementationInterface();
		System.out.println("Area of Circle = "+ii.areaOfCircle(r));
		System.out.println("Circumference of Circle = "+ii.circumferenceOfCircle(r));
		System.out.println("Area of Cylinder = "+ii.areaOfCylinder(r, h));

	}

}
