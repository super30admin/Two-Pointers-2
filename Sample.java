
// Time Complexity : O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// we keep track of fast pointer and slow pointer and compare it with the previous pointer
// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = 0;
        int slow = 1;
        int fast = 1;
        int flag = 0;
        while(fast<nums.length){
            if(nums[prev] == nums[fast]){
                if(flag==0){
                    nums[slow] = nums[fast];
                    slow++;
                    flag = 1;
                }
                fast++;
            }
            else{
                prev=fast;
                nums[slow] = nums[fast];
                slow++;
                fast++;
                flag = 0;
            }
        }
        return slow;
    }
}