// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: We can use hashset to store the frequncy of each element in the list, but this will use extra space on O(n), since the question says use O(1) space we would rather use slow and fast pointer to iterate though each element and replace every element with new digit in the array in place if the occurance count is greater than k=2 in this question

// Your code here along with comments explaining your approach


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;

        int count =1;
        int slow = 1;

        for(int i=1; i< nums.length; i++){

            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count<=2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}