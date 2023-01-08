// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//Approach: In this approach we keep a slow pointer. We check the current and previous elemnet. If they are equal
//we increment the count and when they are not we reset the count. Now if the count is less that or equal to the
//k given then we increment the slow pointer and we replace the ith element at slow pointer. And we return the index of slow.
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length ==0 )return 0;
        if(nums.length ==1)return 1;
        int slow =0;
        int count =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                count=1;
            }
            else{
                count++;
            }
            if(count<=2){
                slow++;
                nums[slow]=nums[i];
            }
        }
        return slow+1;
    }
}