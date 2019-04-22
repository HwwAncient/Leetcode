package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxTwice {

	public static void main(String[] args) {
		
//		int[] a = {12,5,6,4};
//		Integer[] b= new Integrt(a);
//		Arrays.sort(a);
//		System.out.println(a[0]);
//		List<Integer> numList;
//		numList = new ArrayList(Arrays.asList(a));
//		System.out.println(numList.get(0));
		int[] nums = {3, 6, 1, 0};
		System.out.println(dominantIndex(nums));
	}
	
	public static int dominantIndex(int[] nums) {
		
		int len = nums.length;
		int[] numsCopy = nums.clone();
		Arrays.sort(nums);
		int Max = nums[len - 1];
		if(len == 1) return 0;
		else {
			int secMax = nums[len - 2];
			if(Max >= 2 * secMax) {
				for(int i = 0;i < len;i++) 
					if(numsCopy[i] == Max) return i;
			}
			else return -1;
		}
		return 0;
	}
	
	

}
