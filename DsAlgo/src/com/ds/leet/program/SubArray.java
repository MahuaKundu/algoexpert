package com.test.java;

/*Problem Statement #
Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.

Example 1:

Input: [2, 1, 5, 1, 3, 2], k=3 
Output: 9
Explanation: Subarray with maximum sum is [5, 1, 3].*/

public class SubArray {
	public static void main(String args[]) {
		int[] arr = { 2, 3, 4, 1, 5 };
		int k = 2;
		int maxNumber = findMaxSumSubArray(k, arr); // Complexity=o(n*k)
		int maxNumber1 = findMaxSumSubArray1(k, arr); // Complexity=o(n*k)
		System.out.println("Complexity of this program is O(n*k) and MaxNumber is:" + maxNumber);
		System.out.println("Complexity of this program is O(n) and MaxNumber is:" + maxNumber1);
	}

	public static int findMaxSumSubArray(int k, int[] arr) {
		int sum = 0;
		int max = 0, count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			sum = 0;
			count = 0;
			for (int j = i; count < k; j++) {
				sum = sum + arr[j];
				count++;
			}
			if (sum > max) {
				max = sum;
			}
		}
		return max;
	}

	private static int findMaxSumSubArray1(int k, int[] arr) {
		int sum = 0;
		int max = 0;
		int i = 0;
		while (i < k) {
			sum = sum + arr[i];
			i++;
		}
		max=sum;
		while (i < arr.length) {
			sum = sum - arr[i - k] + arr[i];
			if (sum > max) {
				max = sum;
			}
			i++;
		}
		return max;
	}
}
