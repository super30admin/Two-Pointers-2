// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : maintain two pointers slow - to catch the element and
// fast to iterate through the array checking occurences for each number.

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int d = 2; // number of repetitions allowed

        if(nums == null || nums.length == 0){
            return 0;
        }
        int slow = 0;
        int count = 1;


        for(int i = 0 ; i < nums.length; i++){

            if( i != 0 && nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            
            
            if(count <= d){ //// we need these values as they are less than d
                nums[slow] = nums[i]; // catch the element at slow
                slow++;
            }
        }

        return slow;
    }

    private void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}