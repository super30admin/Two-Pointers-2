//Time Complexity- O(n)
//Space Complexity- O(1)
//Successfully ran on leetcode

class Solution {
 public int removeDuplicates(int[] nums) {
     if(nums.length<2) return nums.length;
     int count=1;
      int j=1;
     for(int i=1; i< nums.length; i++){
         
        
         if(nums[i]== nums[i-1]){
             count++;
         }
         else count=1;
         
        if(count<=2){
            nums[j]= nums[i];
            j++;
        } 
         
     }
     return j;
 }
}