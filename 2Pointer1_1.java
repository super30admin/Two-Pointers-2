//Time COmplexity: O(n)
//Space COmplexity: o(1)
//LeetCode : Yes

//start traversing from the second element and compare with the previous element maintainging a count. 
//If the count is less than 2 change the array and move forward. 

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)return 0;
        
        int i =1, j=1, count = 1;
        
        for(i =1;i<nums.length; i++){
            if(nums[i]==nums[i-1])count++;
            else count = 1;
            
            if(count <=2)nums[j++] = nums[i];
        }
        return j;
    }
}