
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
we have two points, slow is to store the elements from fast (atmost twice)
fast is to iterate through all the elements in array and copy the elements if occurence is less than or equal 2
return slow that is the k slots of nums
time - O(n)
space - O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int fast=0;
        int slow=0;
        int count=0;
        int k=2;
        while(fast<nums.length){
            //keep increasing count if same elements is inprevious index
            if(fast!=0 && nums[fast-1]==nums[fast]){
                count=count+1;
            }
            else{
                count=1;
            }
            //if count of element is <=k then copy numbers from fast index to slow index
            if(count<=k){
                nums[slow]=nums[fast];
                slow=slow+1;
            }
            fast=fast+1;
        }
        return slow;  
    }
}