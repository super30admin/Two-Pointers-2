class Solution {

    // Time : O(n ) Space: O(1)
    // will take count variable to atmost keep 2 duplicates and len variable to keep counting length of array.
    // if count >2 and current value is not equal to previous len value it means we found a new number then will add to len position and increase len and reintialize count to 1
    
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0 )
        {
            return 0;
        }        
        int len =1;
        int count =1;
        int curr = nums[0];
        for(int i =1; i < nums.length ; i++){
            if(nums[i] == curr && count <2){
                count++;
                 nums[len] =curr;
                len++;
            }
            else if(nums[i] != curr){
                count=1;
                curr= nums[i];
                nums[len]= curr;
                len++;
            }
        }
        
     return len;   
    }
}