package interfacesdemo;

public class ImplementationInterface implements Circle,Cylinder
{
public double areaOfCircle(double r)
{
	double areacircle=PI*r*r;
	return areacircle;
}
public double circumferenceOfCircle(double r)
{
	double circum=2*PI*r;
	return circum;
}
public double areaOfCylinder(double r,double h)
{
	double areacylinder=(2*PI*r*r)+(2*PI*r*h);
	return areacylinder;
}
}
