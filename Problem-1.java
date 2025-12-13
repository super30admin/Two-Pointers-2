
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Use two pointers to scan the array while keeping track of how many times the current number has appeared consecutively.
// If a number appears more than twice, skip it; otherwise, copy it into the correct position.
// Continue this process through the array and return the length of the filtered portion with at most two duplicates.

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        int j =0;
        int count = 1;
        while (j < nums.length){
            if (j !=0 && nums[j] == nums[j-1]){
                count++;
            }else{
                count = 1;
            }

            if (count<=2){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;  
    }
}
