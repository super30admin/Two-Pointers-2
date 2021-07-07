/*
Author: Akhilesh Borgaonkar
Problem: LC 80. Remove Duplicates from Sorted Array II (Two-Pointers-2)
Approach: Using two-pointers approach here. Everytime I find a new or duplicate element, I copy it to slow pointer index. This brings upto
    2 occurrences of each unique element to the leftmost valid index.
Time Complexity: O(n) where n is number of elements in input array nums[].
Space complexity: O(1) constant
LC verified.
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=0, fast=1;
        Boolean dup = false;
        
        while(fast < nums.length){                  //iterating through input array
            if(nums[slow] == nums[fast] && !dup){   //if a new duplicate is found
                dup = true;
                nums[++slow]=nums[fast];            //copy it to leftmost valid index
            }
            else if(nums[slow] != nums[fast]){      //if a new element is found
                dup = false;
                nums[++slow] = nums[fast];          //copy it to leftmost valid index
            }
            fast++;                                 //else skip and proceed
        }
        return slow+1;
    }
}