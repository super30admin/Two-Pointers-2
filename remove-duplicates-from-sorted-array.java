
// Time Complexity :
O(n) ==> n=input length;
// Space Complexity :
O(1)
// Did this code successfully run on Leetcode :
Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        
        /*we will start from index 2 since there can be atmost 2 numbers that
        can be repeated and this variable fixes the length of the resultant array*/
        
        int index = 2;
        
        for(int i=2;i<nums.length;i++){
            /*we can check if the current element and i-2 element are same
            and if they are same that means element is repeating more than twice 
            and we need to replace this element with some other element*/
            
            if(nums[i] == nums[index-2]) continue;
            
            if(nums[i] != nums[index-2]){
                nums[index] =nums[i];
                index++;
            }
            
        }
        
        return index;
        
    }
}