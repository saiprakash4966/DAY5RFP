package com.bl;

public class EvenODD 
{
	
		public static void main(String[] args)
		{
			int  numbers[]  =new int[] {5,2};
			for(int i=0;i<numbers.length;i++)
			{
				if(numbers[i]%2==0) 
				{
					System.out.println(numbers[i]+ "even number");
				}
				else
				{
					System.out.println(numbers[i]+"Odd number");
				}
			
				}
			}
		}


