// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english: Will be travesing pointer i in array and pointer j to maintain duplicate values of count 2. Will also maintain count variable to keep check that only 2 valus are on the left of j pointer 

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        int count = 1;
        int j = 1;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}