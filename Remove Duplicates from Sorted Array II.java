
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// use 2 pointers i and j, let j point to next position where number can be placed
//when nums[i]==nums[i-1] increment count, when count<=2 copy element from nums[i] into nums[j] increment both pointers, else only i


// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null)
            return 0;
        
        if(nums.length<=2)
            return nums.length;
        
        int j=1, count = 1;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            
            if(count<=2){
                nums[j++] = nums[i];
            }
        }
        
        return j;
    }
}