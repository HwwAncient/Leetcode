package DoublePointer;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		
		char[] s = {'a','b','c','d','e'};
		reverseString(s);
		System.out.println(Arrays.toString(s));
	}
	
    public static void reverseString(char[] s) {
    	int length = s.length;
    	int head = 0;
    	int end = length - 1; 
        while(head < end) {
        	swap(s, head, end);
        	head++;
        	end--;
        }
    }
    
    public static void swap(char[] s, int head, int end) {
    	char T = s[head];
    	s[head] = s[end];
    	s[end] = T;
    }

}
