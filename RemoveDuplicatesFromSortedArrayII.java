// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=2;
        int p1=k;
        int p2=k;
        while(p2<nums.length){
            if(nums[p1-k]!=nums[p2]){
                nums[p1]=nums[p2];
                p1++;
            }
            p2++;
        }
        return p1;
    }
}
