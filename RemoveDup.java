/** 
*Time Complexity :O(n)
*Space Complexity :O(1)
*
*Did this code successfully run on Leetcode : Yes
*
*Three line explanation of solution in plain english : 
*
*Two pointers - pointer goes forward and provides element to be inserted at ith index. 
*
*Your code here along with comments explaining your approach
*
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        //edge 
        if(nums == null || nums.length == 0) return 0;
        
        int pointer = 0;       
	    for(int i = 0; i <nums.length; i++){
            if(pointer < 2 || nums[i] > nums[pointer-2]){
                nums[pointer]= nums[i];
                pointer ++;
            }
        }
        return pointer;
    }
}