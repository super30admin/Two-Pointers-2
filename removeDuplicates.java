/*
TC --> O(n)
SC --> O(1)
 */
class Solution {

    public int removeDuplicates(int[] nums) {

        int slow = 0;
        int fast = 1;
        int count = 1;
        while (fast < nums.length) {
            if (nums[fast] == nums[fast - 1]) {
                count++;

            } else {
                count = 1;
            }

            if (count <= 2) {
                slow++;
                nums[slow] = nums[fast];

            }

            fast++;

        }//while

        return slow + 1;

    }//method
}//class
