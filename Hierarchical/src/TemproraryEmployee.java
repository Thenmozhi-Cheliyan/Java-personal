
public class TemproraryEmployee extends Employee
{
	double Hike=0.35;
	double incSal;
	double updatedHra,updatedPf;
	
	public void incrementedSalary()
	{
		
		incSal=(salary+(salary*Hike));
	}
	// override
	public void calculateAllowances()
	{
		super.calculateAllowances();
		updatedHra=(2*incSal)/100;
		updatedPf=(3*incSal)/100;
	}
	// override
	public void print_Details()
	{
		System.out.println("The incremented Salary of Temprorary Employee is "+incSal);
		System.out.println("New HRA = "+updatedHra);
		System.out.println("New PF = "+updatedPf);
	}	
}
