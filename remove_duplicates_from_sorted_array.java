/*

Did It run on leetcode: Yes
Time Complexity: 0(N)
Space Complexity: 0(1)

Difficulties: Exiting loop even when we have similar elements

Algorithm:
- Two pointers
- keep count of similar elements
- whenever a change of value update(overwrite) array values with the `val` variable.

*/


class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0 || nums.length == 1 || nums.length == 2) {
            return nums.length;
        }

        int val = nums[0];
        int count = 1;
        int idxPos = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (val != nums[i]) {

                if (count >= 2) {
                    nums[idxPos] = val;
                    nums[idxPos + 1] = val;
                    idxPos += 2;
                } else {
                    nums[idxPos] = val;
                    idxPos += 1;
                }
                val = nums[i];
                count = 1;
            } else {
                count++;
            }
        }

        if (count >= 2) {
            nums[idxPos] = val;
            nums[idxPos + 1] = val;
            idxPos += 2;
        } else {
            nums[idxPos] = val;
            idxPos += 1;
        }

        return idxPos;
    }
}