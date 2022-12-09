TC: O(n)
SC: O(1)
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii
class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=1;
        int count =1;
        for(int pt=1;pt<nums.length;pt++){
            if(nums[pt] == nums[pt-1]) count++;
            else count=1;
            if(count<=2){
                nums[idx] = nums[pt];
                idx++;
            }
        }
        return idx;
    }
}
