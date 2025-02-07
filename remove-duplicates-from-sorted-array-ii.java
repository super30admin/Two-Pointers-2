
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english: i have implemented this by using fast and slow pointer technique, 
// here  i start slow and fast at 1 index and by comparing nums[fast] with nums[fast-1] element,
//  if it is same incrementing count by one upto the point where we get new element when i get new element i just resetting the count as 1 because need to start the counter for new element from 1,
// in this scenario till the count 2 collect the elemeent from nums[fast] to nums[slow]
// and incrementing slow++ because slow task is collection of  particular element up to 2 only so that.
//  always incrementing fast pointer to pass through all the elements in array
// Your code here along with comments explaining your approach:


class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int count=1;
        int slow=1;
        int fast=1;
        while(fast<n){
            if(nums[fast] == nums[fast-1]){
                count++;
            }else{
                count = 1;
            }
            if(count <= 2){
               nums[slow]=nums[fast];
               slow++;
            }
            fast++;
        }
        return slow;
    }
}