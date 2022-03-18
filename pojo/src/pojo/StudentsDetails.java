package pojo;

import java.util.ArrayList;

public class StudentsDetails
{
	public static void main(String[] args)
	{
		Student s=new Student();
		ArrayList<Student> list= new ArrayList<>();
		Student s1=new Student("Thenmozhi",1234,24,"5th","O-Grade");
		Student s2=new Student("Chithra",12345,24,"5th","A-Grade");
		Student s3=new Student("Sneha",12346,24,"5th","B-Grade");
		
		list.add(0, s1);
		list.add(1, s2);
		list.add(2, s3);
		
		for(Student i:list)
		{
			System.out.println("Name : " +i.getStudent_Name()+", Roll Number : "+i.getRoll_no()+", Age : "+i.getAge()+", Standard : "+i.getStandrad()+", Grade : "+i.getGrade());
				
		}

	}
}
