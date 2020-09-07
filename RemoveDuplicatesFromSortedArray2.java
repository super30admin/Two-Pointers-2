// Time Complexity : O(N) as we are going the array once.
// Space Complexity : O(1) as we are using just two pointers.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english :
        //Just keep two pointers, one will keep track of where
        //are we inserting elements and other will be iterating 
        //through the array and gettting us elements.

public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        } else if(nums.length == 1) {
            return 1;
        }
       
       int ptr1 = 0;
       int ptr2 = 0;
       int count = 0;
       
       while(ptr2 < nums.length) {
           if(count == 0 || nums[ptr2] != nums[ptr1-1]) {
               count = 1;
               nums[ptr1] = nums[ptr2];
               ptr1++;
               ptr2++;
           } else {
               nums[ptr1] = nums[ptr2];
               ptr1++;
               ptr2++;
               while(ptr2 < nums.length && nums[ptr2] == nums[ptr2-1]) {
                   ptr2++;
               }
               count = 0;
           }
       }
       
       return ptr1;
   }
}
