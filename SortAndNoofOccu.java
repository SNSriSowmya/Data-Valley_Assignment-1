//write a java code for sorting an array, and find number of occurrences of a particular number in java.

import java.util.*;
public class SortAndNoofOccu 
{
	public static void main(String args[]) 
	{
		int[] a = new int[]{5,1,-6,4,0,5,1,-9};
		
		//For Sorting the Array
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The Sorted Array is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//For Finding the number of occurrences of a particular number
		
		int count=0;
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the element of which you want to count number of occurrences:");
	    n = s.nextInt();
	    for(int i = 0; i < a.length; i++)
	    {
	    	if(a[i] == n)
	        {
	    		count++;
	        }
	    }
	    
	    System.out.println("Number of Occurrence of the Element:"+count);
	}
}
