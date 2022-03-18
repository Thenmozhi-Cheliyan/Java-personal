package serialization;
import java.io.Serializable;
import java.util.*;
public class Employee implements Serializable
{
private static final long serialVersionUID = 1L;
public String name;
public String mail_ID;
public int age;
public String gender;
public String department;
public long salary;
public transient long mbl_No;

public void get_Details()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Employee Name: ");
	name=s.nextLine();
	System.out.println("Enter Employee Mail ID: ");
	mail_ID=s.nextLine();
	System.out.println("Enter Age: ");
	age=s.nextInt();
	System.out.println("Enter Gender: ");
	gender=s.next();
	System.out.println("Enter Department: ");
	department=s.next();
	System.out.println("Enter Salary: ");
	salary=s.nextLong();
	System.out.println("Enter Mobile Number: ");
	mbl_No=s.nextLong();	
	s.close();
}
/*
 * public void print_Details()

{
	System.out.println("NAME : "+name);
	System.out.println("MAIL ID : "+mail_ID);
	System.out.println("AGE : "+age);
	System.out.println("GENDER : "+gender);
	System.out.println("DEPARTMENT : "+department);
	System.out.println("SALARY : "+salary);
	System.out.println("MOBILE NUMBER : "+mbl_No);	
}
 */
}
