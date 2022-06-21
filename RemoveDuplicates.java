package com.leetcode;

public class RemoveDuplicates {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int count = 0;
            int index = 0;
            for(int i = 0; i<nums.length-1; i++){
                if(nums[i]==nums[i+1]){
                    count++;
                    if(count>1) continue;
                }
                else{
                    count = 0;
                }
                nums[index] = nums[i];
                index++;
            }

            nums[index]=nums[nums.length-1]; //for last element
            return index+1;
        }
    }
}
