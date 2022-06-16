class Solution {
  
  //TC:O(n) SC:O(1)
    public int removeDuplicates(int[] nums) {
        int low=2;
        if(nums.length<3) return nums.length;
        for(int i=2;i<nums.length;i++){
          if(nums[i]!=nums[low-2]){
            nums[low]=nums[i];
            low++; 
           }
        }
return low;
}
    
}
