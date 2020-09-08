
// Time Complexity : O(n) where n is the number of elements ..since we are looking at it once
// Space Complexity : O(1) since we are manipulating the array
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

// we keep track of three ptrs prev cur and tracker
// prev holds prev ptr curr hold the curr ptr for the input array being modified.. tracker holds the ptr in the output array that is being modified
// 1. see if the prev = curr , and if flag is false then  that means this is our pair .. 
// and we set the flag as true indicating that 2 occurence has been found and disregard the duplicates
// 2.if prev!=curr that means elements are unique so add the cur to the nums using tracker ptr .. also set flag as false
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        if (nums.length <= 2)
            return nums.length;

        int prev = 0, cur = 1, tracker = 1;
        boolean flag = false;
        // true means duplicates, skip this

        while (cur < nums.length) {
            if (nums[prev] == nums[cur]) {
                // if both the conditions are true that means this is the first occurence of the
                // pair
                if (!flag) {
                    flag = true;
                    nums[tracker] = nums[cur];
                    cur++;
                    tracker++;
                } else
                    cur++;
            } else {
                // the cur will be prev and value[cur] will be put into val [tracker]
                // tracker and curr both ++ and flag is set false
                prev = cur;
                nums[tracker] = nums[cur];
                cur++;
                tracker++;
                flag = false;
            }
        }

        return tracker;

    }
}