package bubblesort;
import java.util.*;
public class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int arrayLength;
		System.out.println("Enter Array Size : ");
		arrayLength=input.nextInt();
		int numbers[]=new int[arrayLength];
		boolean swapped;
		System.out.println("Enter the numbers to be sorted : ");
		for(int i=0;i<arrayLength;i++)
		{
			numbers[i]=input.nextInt();
		}
		for(int j=0;j<arrayLength-1;j++)
		{
			for(int k=0;k<(arrayLength-j-1);k++)
			{
				if(numbers[k]>numbers[k+1])
				{
					int temp=numbers[k];
					numbers[k]=numbers[k+1];
					numbers[k+1]=temp;
				}
				System.out.println("The sorted array : "+Arrays.toString(numbers));	
			}	
		}
	}
}
