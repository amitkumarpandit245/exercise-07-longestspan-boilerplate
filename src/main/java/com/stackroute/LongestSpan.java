package com.stackroute;

import java.util.Scanner;

public class LongestSpan {

   	//Do not print anything other than what's expected/asked in problem
    public static void main(String[] args) {
   	//Use Scanner to get input from console
    	Scanner s=new Scanner(System.in);
    	int inputLength=s.nextInt();
    	int[] input=new int[inputLength];
    	for(int i=0;i<inputLength;i++) {
    		input[i]=s.nextInt();
    	}
    	LongestSpan.findLongestSpan(input);
	}

	public static String findLongestSpan(int[] numbers) {
		int longestSpan=0;
		int longestSpanNumber=0;
		String result="";
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				if(numbers[j]==numbers[i]  && longestSpan<(j-i)+1) {
					longestSpan=(j-i)+1;
					longestSpanNumber=numbers[j];
				}
				else if(numbers[j]==numbers[i]  && longestSpan==(j-i)+1){
					longestSpanNumber=(longestSpanNumber>numbers[j]?longestSpanNumber:numbers[j]);
				}
			}
		}
		if(longestSpan==0 ||longestSpanNumber==0) {
			result= "EmptyArray";
		}
		else {
			result=longestSpanNumber+":"+longestSpan;
		}
		
		System.out.println(result);
		return result;
	}
}