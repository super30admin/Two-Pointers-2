// Remove Duplicate from Sorted Array II
// Solved on leetcode
// time complexity -O(n)
// Space complexity - O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count =1;
        int j=1;
        // traversing the nums
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
                
        }
        return j;
    }
}