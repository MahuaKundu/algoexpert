package com.ds.leet.program;

//Find Minimum in Rotated Sorted Array
public class FindMinNumber {

	public static void main(String args[]) {
		int array[] = {2,1};
		int start = 0;
		int end = array.length - 1;
		int mimNumber = findMinNumber(array, start, end);
		System.out.println("This is the mimNumber:" + mimNumber);
	}

	private static int findMinNumber(int[] array, int start, int end) {
		
		if(array.length==0)
		{
			return -1;
		}
		int mid = 0, min = 0;
		mid = (start + end) / 2;
		while(start<=end) {
		if (array[start] < array[mid]) {
			
			while(array[mid]>array[mid+1]) {
				mid++;
			}

		} else if (array[start] > array[mid]) {
			
			while(array[mid]<array[mid+1]) {
				mid--;
			}
		}
		}
		return array[mid];
	}

	/**private static int binarySearch(int[] array) {
		int start = 0, end= array.length, mid=0;
		while (start < end) {
			mid = (start + end) / 2;
			System.out.println(start + ", " + mid + "," + end);
			System.out.println("===" + array[start] + ", " + array[mid] + "," + array[end]);
			if (array[start] < array[mid]) {
				start = mid + 1;

			} else if (array[start] > array[mid]) {

				end = mid - 1;
			} else {
				return array[mid];
			}
		}
		return mid;
	}**/
}
