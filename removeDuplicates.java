//Time Complexity: O(n)
// Space Complexity: O(1)
//80. Remove Duplicates from Sorted Array II
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        int n=nums.length, k=2;
        int freq=1, prev=nums[0],j=1;
        for(int i=1;i<n;i++)
        {
            // Check if the current element is equal to the prev element
            if(nums[i]==nums[i-1])
            {
                freq++;
            }
            else
            {
                freq=1;
            }
            
            
            if(freq<=k)
            {
               
                nums[j]=nums[i];
                j++;
            
            }
            
        }
    
        // j would be the length of the resultant array
        return j;
    }
    
    
}