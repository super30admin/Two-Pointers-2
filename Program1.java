//Time Complexity : O(n)
//Space Complexity : O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0){
            return -1;
        }
        
        if(nums.length<=2){
            return nums.length;
        }
    
        int j=1;
        int count=1;
        
        for(int i=1; i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                count++;
            }else{
                count=0;
            }
            
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
            
        }
        return j;
    }
}