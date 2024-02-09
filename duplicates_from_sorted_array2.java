
// Time - O(n)
// Space - O(1)


class Solution {
    public int removeDuplicates(int[] nums) {
       int i=1;
       int j=1;
       int count = 1;
       int n=nums.length;
       while(j<n){
           if(nums[j]==nums[j-1]){
               count++;
           }
           else{
               count=1;
           }
           if(count<=2){
                nums[i]=nums[j];
                i++;
           }
               j++;
           
       }
       return i;
        
    }
}

