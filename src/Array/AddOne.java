package Array;

import java.math.BigInteger;

public class AddOne {
	
	public static void main(String[] args) {
		
//		String a = String.valueOf(1);
//		System.out.println(a);
//		
//		int[] c = {1,2,3};
//		for(int b:c) {
//			b += 1;
//		}
//		System.out.println(c[0]);
		int[] digits = {9,8,7,6,5,4,3,2,1,0};
		System.out.println(plusOne(digits)[8]);
		
//		BigInteger a = new BigInteger("9876543210");
//		System.out.println(a);
	}
	
	public static int[] plusOne(int[] digits) {
        
		String digit = "";
		for(int num : digits) digit += String.valueOf(num);
		BigInteger a = new BigInteger(digit).add(new BigInteger("1"));
		char[] newDigit = String.valueOf(a).toCharArray();
		int len = newDigit.length;
		int[] nums = new int[len];
		for(int i = 0; i< len;i++) nums[i] = Integer.parseInt(String.valueOf(newDigit[i]));
		
		
		
		return nums;
    }
}
