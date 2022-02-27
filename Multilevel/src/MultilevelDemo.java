
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
	


