class Solution {
    public int removeDuplicates(int[] nums) {
    int i = 0;
   int count =1;
        int j =1;
        
      
        for(; j<nums.length;j++){
            if(nums[i]==nums[j]){
                if(count<=2){
                    i++;
                    count++;
                }
            }
            else{
                i++;
                nums[i]= nums[j];
                count=1;
            }
        }
        return j;
    }
}