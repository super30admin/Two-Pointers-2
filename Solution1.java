// Time Complexity :O(n)n being the size of the array
// Space Complexity :O(1) no extra space used
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// using 2 pointer approach find next position to add the new element while traversing the array
// Your code here along with comments explaining your approach
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null|| nums.length==0)
            return 0;
        int j=1;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<3){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}