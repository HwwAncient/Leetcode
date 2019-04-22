package Array;

import java.util.ArrayList;
import java.util.List;

public class CenterIndex {
	
	public static void main(String[] args) {
		
		int[] nums = {-1,-1,-1,0,1,1};
		System.out.println(pivotIndex(nums));
	}
	
	public static int pivotIndex(int[] nums) {
        
		int len = nums.length;
		List<Integer> centerIndex = new ArrayList<Integer>(); 
		for(int i = 0;i < len;i++) {
			int num = nums[i];
			int[] leftAndRight = getLeftAndRight(nums, i);
			if(leftAndRight[0] == leftAndRight[1]) centerIndex.add(i);
		}
		if(centerIndex.isEmpty()) return -1;
		else return centerIndex.get(0);
    }
	
	public static int[] getLeftAndRight(int[] nums, int num) {
		int[] T = new int[2];
		int left = 0;
		int right = 0;
		if(num != 0) for(int i = 0;i < num;i++) left += nums[i];
		if(num != nums.length) for(int i = num + 1;i < nums.length;i++) right += nums[i];
		T[0] = left;
		T[1] = right;
		return T;
	}
}
