// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Every time we encounter a duplicate we increment the count,
// once the count is above a certain amount we update with slow pointer.

import java.util.Arrays;

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int slow = 1; int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                nums[slow]=nums[i];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args){
        int [] nums = new int[]{0,0,1,1,1,1,2,3,3};
        RemoveDuplicates rd = new RemoveDuplicates();
        System.out.println(rd.removeDuplicates(nums));
    }
}