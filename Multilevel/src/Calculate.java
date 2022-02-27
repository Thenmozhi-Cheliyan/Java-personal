
public class Calculate extends Student
{
	void calculations()
	{
		total=m1+m2+m3;
		avg=total/3;
	}
	void grading()
	{
		if(avg>=90)
		{
			grade="OUTSTANDING";
		}
		else if(avg<90&&avg>=80)
		{
			grade="EXCELLENT";
		}
		else if(avg<80&&avg>=70)
		{
			grade="DISTINCTION";
		}
		else if(avg<70&&avg>=60)
		{
			grade="GOOD";
		}
		else if(avg<60&&avg>=50)
		{
			grade="POOR";
		}
		else
		{
			grade="REAPPEAR";
		}
	}
}
