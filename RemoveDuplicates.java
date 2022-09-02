// Time Complexity : O(n) where n is the length of given array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
We can have at most 2  values which are same. First element is always unique, hence start with our pointers slow and fast at position 1.
 Slow pointer keeps track of the unique element.
 */

// Your code here along with comments explaining your approach

public class RemoveDuplicates {
        public int removeDuplicates(int[] nums) {

            //null check
            if(nums == null || nums.length == 0)
                return 0;

            int count = 1;
            int slow = 1;

            for(int fast =1 ; fast <nums.length ; fast++){
                if(nums[fast] == nums[fast-1]){
                    count++;
                }
                else count = 1; //reset count

                if(count <= 2){
                    nums[slow] = nums[fast];
                    slow++;
                }
            }
            return slow;
        }
}

