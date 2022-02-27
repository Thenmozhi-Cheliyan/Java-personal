import java.util.*;
public class Student 
{
	Scanner s=new Scanner(System.in);
	String name,department,course;
	char gender;
	long mblno;
	String residence;
	int age,rno,m1,m2,m3;
	float avg,total;
	String grade;
	
	void get_personal_details()
	{
		System.out.println("Enter Student Name: ");
		name=s.nextLine();
		System.out.println("Enter Roll Number:");
		rno=s.nextInt();
		System.out.println("Enter Gender(M/F): ");
		gender=s.next().charAt(0);
		System.out.println("Enter Age: ");
		age=s.nextInt();
		System.out.println("Enter Mobile Number: ");
		mblno=s.nextLong();
		s.nextLine();
		System.out.println("Enter Residensial Address: ");
		residence=s.nextLine();
	}
	void get_academic_details()
	{
		System.out.println("Enter Department: ");
		department=s.nextLine();
		System.out.println("Enter Course Name: ");
		course=s.nextLine();
		System.out.println("Enter Mark 1: ");
		m1=s.nextInt();
		System.out.println("Enter Mark 2: ");
		m2=s.nextInt();
		System.out.println("Enter Mark 3: ");
		m3=s.nextInt();
	}	
}
