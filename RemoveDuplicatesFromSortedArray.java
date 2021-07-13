// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int prev=0, slow=1, fast=1;

        int flag=0;

        while(fast<nums.length) {

            if(nums[fast]==nums[prev]) {
                if(flag==0) {
                    nums[slow]=nums[fast];
                    slow++;
                    fast++;
                    flag=1;
                }

                else {
                    fast++;
                }
            }

            else {

                prev=fast;
                nums[slow]=nums[fast];
                slow++;
                fast++;
                flag=0;
            }
        }
        return slow;
    }

}