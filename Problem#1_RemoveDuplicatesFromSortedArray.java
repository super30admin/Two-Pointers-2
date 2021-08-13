class Solution {
    public int removeDuplicates(int[] nums) {
        //Edge case:
        if(nums==null || nums.length==0){
            return 0;
        }
        
        //Loop to check if the elements are placed correctly
        // inititally check with idx i
        // We can use counter to check counts of curent element
        int count = 1;
        int i = 1, j = 1;
        
        while(i<nums.length){
            //Comparison starts from 1st index
            //First keep track of counts
            if(nums[i-1]==nums[i]){
                count++;
            }else{
                count =1;
            }
            //Now keep track of other replacements
            //If I want only one repetition: 
            //if(count<2){
            //In given problem I need 2 repetitions to exist , so "<="
            if(count<=2){
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
        
    }
}