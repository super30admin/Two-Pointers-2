// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Maintain two pointers i and one for iterating list.We check if num is repeating by coparing it with i-2 index and then skip it. 
class RemoveDupsInSortedArrSolution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) {
            return 0;
        }
        int i=0;
        for(int num : nums) {
            System.out.println("i:"+i+" num:"+num+" nums[i]:"+nums[i]);
            if(i==0 || i==1 || num!=nums[i-2]) {
                nums[i++] = num;
            }
        }
        return i;
    }
}