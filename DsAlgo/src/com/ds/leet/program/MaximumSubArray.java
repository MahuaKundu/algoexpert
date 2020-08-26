package com.ds.leet.program;

//input:[2,3,-2,4]
// output[6]
public class MaximumSubArray {

	public static void main(String args[])
	{
		int array[]=new int[] {2,3,-2,4};
		int length=array.length;
		int cache[]=new int[length];
		int count=0;
		int bigNumber = 0;
		for(int i=0;i<length-1;i++)
		{
			cache[i]=array[i]*array[i+1];	
		}
		while(count<length-1)
		{
			if(bigNumber<cache[count])
			{
				bigNumber=cache[count];
			}
			count++;		
		}		
		System.out.println(" The maxmim sub array:"+bigNumber);
	}
}

