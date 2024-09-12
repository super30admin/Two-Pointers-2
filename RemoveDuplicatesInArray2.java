package day13_TwoPointer2;

public class RemoveDuplicatesInArray2 {
	// Time Complexity : O(n)
    // Space Complexity : O(1)
    // Idea: 1. Start iterating the array with 2 pointers side by side
    //       2. As soon as we come across 3 repeating elements, shift next element and
	//           and return the index value 
    
    public int removeDuplicates(int[] nums) {
        if(nums == null) {
            return 0;
        }
        
        if(nums.length < 2) {
            return nums.length;
        }
        
        int i = 1;
        int j = 2;
        
        while(j < nums.length) {
            if(nums[j] == nums[i] && nums[j] == nums[i - 1]) {
                j++;
            }
            else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        
       return i + 1;     
}
	
}
