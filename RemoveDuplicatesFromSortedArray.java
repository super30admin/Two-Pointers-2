
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// fast pointer - keeps count of the number , slow pointer - updates the values till k = 2 times

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length; int slow =0;
        int count = 1; int k =2;

        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                count++;
            } else count =1;

            if(count<=k){
                nums[slow] = nums[i];
                slow++;
            }
        }

        return slow;
    }
}