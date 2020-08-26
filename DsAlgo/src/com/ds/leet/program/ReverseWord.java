package com.ds.leet.program;

import java.util.Stack;

public class ReverseWord {

	public static void main(String[] args) {

		String s1 = " The Sky is blue   ";
		reverseTheWord(s1);
	}
	private static void reverseTheWord(String s1) {

		char array[] = s1.toCharArray();
		Stack stack = new Stack();
		StringBuilder word = new StringBuilder();
		StringBuilder reverseWord = new StringBuilder();
		int start = 0, end = 0;

		for (int i = 0; i < array.length-1; i++) {
			if (array[i] != ' ') {
				start = i;
				//System.out.println("What is the value of Start"+start);
				while (array[i] != ' ') {
					//System.out.println("This is inside the while loop"+i);
					i++;
				}
				end = i - 1;
				//System.out.println("What is the value of End"+end);
				while (start <= end) {
					word.append(array[start]);
					start++;
				}
				System.out.println(word);
				stack.push(word);
				//word = new StringBuilder();
			}
		}
  
		while (stack.size() > 1) {
			reverseWord.append(stack.pop()).append(" ");
			
		}
		reverseWord.append(stack.pop());
        System.out.println(reverseWord);
	}

}
