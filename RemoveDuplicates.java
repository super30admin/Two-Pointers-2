// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Two pointer fast and slow, As long as number of duplicates is less than or equal to 2 replace those elements with fast else ignore and move fast

// Your code here along with comments explaining your approach
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;
        int count = 1;
        
        while(fast<nums.length){
            if(nums[fast]==nums[slow]){
                count++;
            }else{
                count = 1;
            }
            if(count<=2){
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
}
