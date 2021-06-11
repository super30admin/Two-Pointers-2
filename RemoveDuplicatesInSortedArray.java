// TC: O(n)
// SC: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int i, j, k, count;
        //Starting from 1 as 1st element is always unique, and the count will also be 1 to accomodate this
        i = 1;
        j = 1;
        count = 1;
        //Generalising the solution, hence used k. k is 2 here
        k = 2;
        while(i < nums.length) {
            if(nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if(count <= k) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}