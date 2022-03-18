package serialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class DeserializationDemo 
{

	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException
	{
		DeserializationDemo deserializationdemo=new DeserializationDemo();
		deserializationdemo.readEmployeeObject();

	}
	
	public void readEmployeeObject()throws FileNotFoundException,IOException,ClassNotFoundException
	{
		FileInputStream fileinputstream=null;
		ObjectInputStream objectinputstream=null;
		
		try
		{
			fileinputstream=new FileInputStream("Employee.txt");
			objectinputstream=new ObjectInputStream(fileinputstream);
			
			Employee employee=(Employee)objectinputstream.readObject();
			
			System.out.println("Successfully read objects");
			System.out.println("NAME : "+employee.name);
			System.out.println("MAIL ID : "+employee.mail_ID);
			System.out.println("AGE : "+employee.age);
			System.out.println("GENDER : "+employee.gender);
			System.out.println("DEPARTMENT : "+employee.department);
			System.out.println("SALARY : "+employee.salary);
			System.out.println("MOBILE NUMBER : "+employee.mbl_No);	
		}
		finally
		{
			if(objectinputstream!=null)
			{
				objectinputstream.close();
				fileinputstream.close();
			}
		}
	}

}
