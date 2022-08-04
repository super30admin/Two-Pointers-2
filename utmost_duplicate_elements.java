//TC: O(n)
//SC: O(1)
//Leetcode: successful


class Solution {
    public int removeDuplicates(int[] nums) {
        int utmost_k =2;
        int slow = 1;
        int count =1;
        for(int fast =1;fast< nums.length;fast++){
            if(nums[fast]==nums[fast-1])
                count++;
            else 
                count =1;
            if(count<=utmost_k)
            {nums[slow]=nums[fast];
             slow++;
            }
        }
        return slow;
    }
}