package DoublePointer;

public class Learn_doublePointer2 {

	public static void main(String[] args) {
		
		/*
		 *  Fast Pointer(i) and Slow Pointer(k)
		 */
		
		
	}
	
	public int removeElement(int[] nums, int val) {
	    int k = 0;
	    for (int i = 0; i < nums.length; ++i) {
	        if (nums[i] != val) {
	            nums[k] = nums[i];
	            k++;
	        }
	    }
	    return k;
	}

}
