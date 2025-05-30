/*
Time Complexity - O(N)
Space complexity - O(1)
Did this code successfully run on LeetCode :  Yes
Any problem you faced while coding this :  No
*/

public class RemoveDuplicatesFromSoretdArray_LC_80 {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int k =2;
        int slow = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]){
                count++;
            } else{
                count = 1;
            }
            if(count <=k){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}