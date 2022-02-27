
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
//Using two pointers , one for tracking the current number and another to track where to insert new elements.

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        
        
        int insert=0;
        int counter=0;
        
        for (int running=0;running<nums.length;++running){
            
            if(running==0|| nums[running]==nums[running-1]){
                
                ++counter;
            }else{
                
                counter=1;
            }
            
            if(counter<=2){
                nums[insert]=nums[running];
                ++insert;
            }
        }
        
        return insert;
    }
}
