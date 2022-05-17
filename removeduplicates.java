/ Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english
//Start from the second index. if its equal to prev element then count is incremented. If count less than 2 then increment the low
then increment the high. at last return low


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int l=1,count=1,h=1;
        while(h<nums.length){
            if(nums[h]==nums[h-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                nums[l]=nums[h];
                l++;
            }
            h++;
        }
        return l;
    }
}