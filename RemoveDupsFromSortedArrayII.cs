// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// This approach uses two pointers, fast to traverse the array and slow to track the 
//position for non-duplicate elements. It counts the occurrences of each element and only 
//allows up to k occurrences to be placed in the array by copying valid elements to the slow pointer. The function returns slow, representing the 
//new length of the modified array without extra duplicates.


public class Solution {
    public int RemoveDuplicates(int[] nums) {
        int slow = 0,fast =0;
        int k =2, count = 0;
        while(fast<nums.Length){
            if(fast>0 && nums[fast] == nums[fast-1]){
                count++;
            }else{
                count = 1;
            }
            if(count <=k){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}