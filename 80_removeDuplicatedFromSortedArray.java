
    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
    Time Complexity for operators : o(n) .. n is the length of the array
    Extra Space Complexity for operators : o(1)
    Did this code successfully run on Leetcode : NA
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : hashmap to store the counts of elements and then check if it is greate than 2 then 
                           avoid else add to array.
        # Optimized approach: 
                              
            # 1. 
                    A) start array from 2nd element and check if it is equal
                    B) if it is then  increase the counter. if not make counter to 1.
                    C) if counter <= 2, then make changes to nums
                    D) return j at the end.
    */ 


class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1, counter = 1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                counter++;
            else
                counter = 1;
            
            if(counter <= 2){
                nums[j++] = nums[i];
            }
        }
        
        return j;
    }
}