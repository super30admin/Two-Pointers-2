class Solution {
    public int removeDuplicates(int[] nums) {

        //O(n) time O(1) space

        int j =1;
        int count = 1;

        for (int i=1; i<nums.length; i++) {

            if (nums[i] == nums[i - 1]) count++;
            else count = 1;

            //We can replace the 2 with any generalized k value
            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;

    }
}