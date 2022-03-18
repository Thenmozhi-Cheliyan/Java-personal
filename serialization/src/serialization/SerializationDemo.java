package serialization;
//import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializationDemo
{

	public static void main(String[] args)throws FileNotFoundException,IOException,ClassNotFoundException
	{
		SerializationDemo serializationdemo=new SerializationDemo();
		serializationdemo.writeEmployeeObject();	
	}
	private void writeEmployeeObject()throws FileNotFoundException,IOException
	{
		//FileOutputStream fileoutputstream=null;
		//ObjectOutputStream objectoutputstream=null;
		FileOutputStream fileoutputstream =new FileOutputStream("Employee.txt");
		ObjectOutputStream objectoutputstream =new ObjectOutputStream(fileoutputstream);
			
		try
		{
	//	FileOutputStream fileoutputstream =new FileOutputStream("Employee.txt");
	//	ObjectOutputStream objectoutputstream =new ObjectOutputStream(fileoutputstream);
			
			Employee employee=new Employee();
			employee.get_Details();
			
			System.out.println("NAME : "+employee.name);
			System.out.println("MAIL ID : "+employee.mail_ID);
			System.out.println("AGE : "+employee.age);
			System.out.println("GENDER : "+employee.gender);
			System.out.println("DEPARTMENT : "+employee.department);
			System.out.println("SALARY : "+employee.salary);
			System.out.println("MOBILE NUMBER : "+employee.mbl_No);	
			
			objectoutputstream.writeObject(employee);
			System.out.println("Successfully written employee object to File.\n");
				
		}
		finally
		{
		/*	if(objectoutputstream!=null)
			{*/
				fileoutputstream.close();
				objectoutputstream.close();
				//fileoutputstream.close();
		//	}
		}
	}

}
