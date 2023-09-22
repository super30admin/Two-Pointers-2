// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
//we use two pointer one is fast pointer i and another is slow pointer j
//we here check if curr and prev is equal :then increase count
//else reset count 
//we simultaneously check if count <=2 then put nums[i] at nums[j] and increase j++
// Your code here along with comments explaining your approach



class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null|| nums.length==0){
            return 0;
        }
        int i=1;
        int j=1;
        int count=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}