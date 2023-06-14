
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: No

// Your code here along with comments explaining your approach
/*1. Keep a pointer i and j and check if the two consecutive numbers are same and keep a counter to increment if duplicates are found.
copy the value of i to j. Increment i at each iteartion.
Run the loop until the length of nums * 
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        //base case 
        if(nums.length<2) return nums.length;
        int n =nums.length, j=1, count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count<=2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
        }
         
    }