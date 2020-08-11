//time complexity: O(n)
//space complexity : O(1)
//executed on leetcode: yes
//approach: place pointers refers to the position which can be overwritten
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3) return nums.length;
        //if say we have [0,1] or [0,0], we dont care much because we cant have more than 2 duplicated of the same number
        int place = 2;
        for(int right = 2;right<nums.length;++right)
        {
            if(nums[place-2]!=nums[right]) nums[place++] = nums[right];
        }
        return place;
    }
}