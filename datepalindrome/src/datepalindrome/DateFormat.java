package datepalindrome;
import java.util.*;
import java.text.*;

public class DateFormat 
{
	public static void main(String[] args) 
	{
		SimpleDateFormat formater=new SimpleDateFormat("ddMMyyyy");
		Date date=new Date();
		System.out.print("Todays Date ");
		System.out.println(formater.format(date));
		
		long datenumber=Integer.parseInt(formater.format(date));
		
		long temp=datenumber;
		long lastDigit,reverse=0;
		do
		{
			lastDigit=temp%10;
			reverse=(reverse*10)+lastDigit;
			temp=temp/10;
		}
		while(temp>0);
		if(reverse==datenumber)
		{
			System.out.println(datenumber+" is a palindrome");
			System.out.println("***************TODAY IS A PALINDROME DAY******************");
		}
		else
		{
			System.out.println(datenumber+" is not a palindrome");
		}
	}
}
