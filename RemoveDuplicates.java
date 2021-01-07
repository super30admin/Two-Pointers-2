// Time Complexity : The time complexity is O(n) where n is the length of the array
// Space Complexity : The space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Since the array is sorted, for every number we iterate, we check the previous number. If the previous number is not equal to the
// current number that means this is its first occurence. If the previous number is equal to the current number, that means this is not
// its first occurance. So we will maintain its frequency which should not be greater than 2. Accodingly we will copy the numbers in
// an index.

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length < 3){
            return nums.length;
        }

        int freq = 1;
        int cur = 1;

        for(int i=1;i<nums.length;i++){

            // Not the first occurance but its frequency is less than 2
            if(nums[i] == nums[i-1] && freq < 2){
                freq++;
                nums[cur++] = nums[i];
            }
            // First occurance of a number
            else if(nums[i] != nums[i-1]){
                freq = 1;
                nums[cur++]=nums[i];
            }

        }

        return cur;

    }
}