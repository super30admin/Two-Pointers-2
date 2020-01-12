// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
//	1. Set slow and fast pointers to first and second elements respectively
//	2. Bubble the slow pointer elements till fast pointer does not reach the end
//	3. As duplicate elements will be over written, correct array will be available at end

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int slow = 0;
        int fast = 1;
        boolean flag = false;
        while(fast < nums.length){
            if(nums[slow] == nums[fast]){
                if(!flag){
                    flag = true;
                    slow++;
                    nums[slow] = nums[fast];
                    fast++;
                } else {
                    while(fast < nums.length && nums[fast] == nums[fast - 1]) fast++;
                }
            } else {
                flag = false;
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
        }
        return ++slow;
    }
}