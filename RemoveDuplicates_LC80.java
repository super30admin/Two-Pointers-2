//Time: O(n)

//Space = O(1) 

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        //Start from 2nd element
        int j = 1; 
        int count = 1;
        
        for(int i = 1; i < nums.length; i++){
            //increase the count is prev element is same
            if(nums[i] == nums[i-1])
                count++;
            else
                count = 1;
            
            //increase the 2nd pointer and replace the elements
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}