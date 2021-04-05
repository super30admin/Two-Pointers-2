/*
 *  Time Complexity: O(N) Where N is the length of nums array.
 *  Space Complexity: O(1) Since we are mutating the nums array.
 *
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : Design the approach to hold the min element.
 *
 *  Explanation: We maintain a current index(index) and a running index(i), we also keep track of the number of occurances of the current element. If we find more than 2 element, we simply increment the running pointer, else we place the value at running pointer in current pointer and increment both the pointers and set the count to 1. At last we return the current pointer.
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int index=1, count=1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[index-1]){
                if(count>=2){
                    continue;
                }else{
                    nums[index]=nums[i];
                    index++;
                }
                count++;    
            }else{
                nums[index]=nums[i];
                index++;
                count=1;
            }
        }
        return index;
    }
}
