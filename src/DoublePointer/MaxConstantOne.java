package DoublePointer;

public class MaxConstantOne {
	
	public static void main(String[] args) {
		int[] nums = {0,1,1};
		int R = findMaxConsecutiveOnes(nums);

//		for(int i = 0;i<R;i++) System.out.println(nums[i]);
		System.out.println(R);
	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		int k = 0;
		int count = 0;
		for(int i = 0;i < nums.length;i++) {
			if(nums[i] != 0) {
				count++;
				if(i == nums.length - 1) {
					nums[k] = count;
					k++;
				}
			}
			else {	
				nums[k] = count;
				k++;
				count = 0;
			}
		}
		
		if(k==1) return nums[k-1];
		for(int j = 0;j < k;j++)
			if(j < nums.length - 1) 
				if(nums[j] > nums[j + 1]) 
					nums[j + 1] = nums[j];
		return nums[k - 1];
	}
	
}
