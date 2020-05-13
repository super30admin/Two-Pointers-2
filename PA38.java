//Leetcode : 80. Remove Duplicates from Sorted Array II
//Time Complexity : O(n) , n is no of elememts in nums
//Space Complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
 
        if(nums.length<=2){
            return nums.length;
        }
        int fl=0;
        int count=0;
        for(int i=1;i<nums.length;i++){        
                    if(nums[count]==nums[i] && fl<1){
                        fl++;
                        count++;
                         nums[count]=nums[i];
                    }
                    else{
                        if(nums[count]!=nums[i]){
                            count++;
                            nums[count]=nums[i];
                            fl=0;
                        }
                    }                    
            }
       return count+1;
        
    }
}