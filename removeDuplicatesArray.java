//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int removeDuplicates(int[] nums) {
        //base case
        if(nums==null||nums.length==0)
            return 0;
        //initialize two pointers slow and fast with count
        int s=1, count=1;
        //iterating over the array
        for(int f=1;f<nums.length;f++){
            //if it was equal to previous value
            if(nums[f]==nums[f-1]){
                //if same, increment count
                count++;
            }
            else{
                //if not same, reset to 1
                count=1;
            }
            if(count<=2){
                nums[s]=nums[f];
                s++;
            }
        }
        return s;
    }
}