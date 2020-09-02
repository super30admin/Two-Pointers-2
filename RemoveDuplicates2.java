// TC: O(N) where N represents the length of the array.
// SC: O(1) since we are not using any extra space

// We are checking if the 2 previous value is greater than present value, We are adding only if the values are greater than previous values.
// We are adding the value from the starting index until we reach end of array, we will return the last index of the added value.

public class RemoveDuplicates2 {

	public int removeDuplicates(int[] nums) {
		
		int i = 0;
		for(int n: nums) {
			if(i<2 || n > nums[i-2])
				nums[i++] = n;
		}
		return i;
	}
	
	public static void main(String[] args) {
		
		RemoveDuplicates2 rd = new RemoveDuplicates2();
		int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 4, 5};
		System.out.println(rd.removeDuplicates(nums));
	}
	
}
