// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: No issues

// Your code here along with comments explaining your approach: 
// at each element we are checking it with the previous .. if they are same increment the count
// if the count is less than or equal to 2 add the element at the slow pointer. else if the count
// is greater than 2 reset the count to 1

class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length<=2) return nums.length;
        int slow=0;
        int count=1;
       // int k=2; //2 duplicates are allowed
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }else{
                count=1;
            }

            if(count<=2){
                slow++;
                nums[slow]= nums[i];
            }
        

        }
        return ++slow;
    }
}