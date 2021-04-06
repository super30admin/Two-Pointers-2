// Time Complexity :O(n) n is the length of nums1;
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//using two pointers: slow and fast, starting from index 1, incrementing both slow and fast and doing nums[slow]=nums[fast] if their 
// frequency count is <=2 and if frequency count is more than 2 incrementing fast and count, once we find diff value other than the repeated bring
// count to 1.
// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=1, fast=1,count=1;
        while(fast<nums.length){
            if(nums[fast]==nums[fast-1] ){
               count++;
            }else count=1;
            if(count<=2){
                nums[slow]=nums[fast];
                fast++;
                slow++;
            }else fast++;
        }
        return slow;
    }
}