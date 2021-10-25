
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// There are two conditions if number is equal to previous element or not.
// If number is equal then check the number of occurrences if its less than two keep it otherwise skip it.
// If number is not equal the keep it and set new counter to 0.
  
// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int k =1;
        int temp = nums[0];
        int count = 0;
        while(i<nums.length) {
            if(nums[i] == temp) {
                if(count<1) {
                    nums[k] = nums[i];
                    count++;
                    k++;  
                }
            }
            else {
                temp = nums[i];
                count = 0;
                nums[k] = temp;
                k++;
            }
            i++;
        }
        return k;
    }
}