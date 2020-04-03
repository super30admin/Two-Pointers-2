// Time Complexity : O(n) n=number of elements in array. 
// Space Complexity : O(1) traverse same array and sort in place.  
// Did this code successfully run on Leetcode :yes. 

// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// Using two pointers i and l, plus the counter of number of ocurrences of a integer.
//Success
//Details 
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array II.
//Memory Usage: 39.8 MB, less than 5.26% of Java online submissions for Remove Duplicates from Sorted Array II.
   public int removeDuplicates(int[] nums) {
        if (nums==null||nums.length==0)
            return 0;
        int l=1,count=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]==nums[i-1])
                count++;
            else
                count=1;
            if (count<=2)
                nums[l++]=nums[i];//
        }
        return l;
    }