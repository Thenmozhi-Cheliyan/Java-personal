import java.util.*;
public class EnumDemo 
{
	public static void main(String[] args) 
	{
		
		String d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day to get your Schedule :");
		d=s.next();
		Days days=Days.valueOf(d.toUpperCase());
		s.close();
		
		switch(days)
		{
		case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY:
			System.out.println(" To Do List Of "+d);
			System.out.println("1) Mentor Meet\n2) CodeChef Contest\n3) Seminar");
			break;
		case SATURDAY:
			System.out.println("SATURDAY'S TO DO LIST");
			System.out.println("Outing with Friends");
			break;
		case SUNDAY:
			System.out.println("SUNDAY'S TO DO LIST");
			System.out.println("Family Time");
			break;
		}

	}

}
