
public class MultilevelDemo
{

	public static void main(String[] args) 
	{
			PrintAll p=new PrintAll();
	
		
		System.out.println("GETTING PERSONAL DETAILS........................");
		System.out.println();
		p.get_personal_details();
		System.out.println();
		System.out.println("GETTING ACADEMIC DETAILS........................");
		System.out.println();
		p.get_academic_details();
		p.calculations();
		p.grading();
		System.out.println();
		System.out.println("***********PERSONAL DETAILS*************");
		System.out.println();
		p.print_personal_details();
		System.out.println();
		System.out.println("***********ACADEMIC DETAILS*************");
		System.out.println();
		p.print_academic_details();
		}
	}
	
/*
 GETTING PERSONAL DETAILS........................

Enter Student Name: 
Thenmozhi
Enter Roll Number:
10533
Enter Gender(M/F): 
F
Enter Age: 
23
Enter Mobile Number: 
9876543210
Enter Residensial Address: 
No.4,Kurunji street,Gandhi Nagar,Trichy

GETTING ACADEMIC DETAILS........................

Enter Department: 
Computer Science
Enter Course Name: 
MCA
Enter Mark 1: 
67
Enter Mark 2: 
89
Enter Mark 3: 
90

***********PERSONAL DETAILS*************

NAME		 : Thenmozhi
ROLL NUMBER	 : 10533
GENDER		 : F
AGE		 : 23
MOBILE NUMBER	 : 9876543210
ADDRESS		 : No.4,Kurunji street,Gandhi Nagar,Trichy

***********ACADEMIC DETAILS*************

DEPARTMENT	 : Computer Science
COURSE		 : MCA
TOTAL		 : 246.0
AVERAGE		 : 82.0
GRADE		 : EXCELLENT

 */

