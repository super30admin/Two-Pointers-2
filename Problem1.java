// 80. Remove Duplicates from Sorted Array II

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return  0;
        
        int  j =1, cnt =1;
        for(int i = 1; i < nums.length ; i++)
        {
            
            if(nums[i] == nums[i-1]){
                cnt++;
            }
            else {
                cnt = 1;
            }
            if(cnt <= 2)
            {
                nums[j] = nums[i];
                j++;
                }
            
            }
        return  j;
       
        
    }
}

/*
Complexity Analysis

Time Complexity: 
O(N) since we process each element exactly once.
Space Complexity: 
O(1). 
*/