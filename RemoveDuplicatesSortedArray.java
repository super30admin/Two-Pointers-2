
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/** Taking a slow pointer for new index,
 checking if previous and current number are same then incrementing counter,
 if counter <= k then updating slow pointer with nums[i]
 and incrementing slow pointer. Slow pointer maintains the length of new array so returning slow pointer. */
class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int slow =0;
        int count=0;
        int n = nums.length;
        int k=2;

        for(int i=0;i<n;i++) {
            if(i != 0 && nums[i] == nums[i-1]) {
                count++;
            }else{
                count=1;
            }

            if(count <= k) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}