
//Time Complexity - O(n)
//Space Complexity - O(1)


class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1, count = 1;

        for (int i = 1; i < nums.length; i++) {


            // if the current element is equal to previous one increment the count or reset the count to 1
            if(nums[i] == nums[i - 1]) {

                count++;


            }
            else {

                count = 1;

            }

            // remove unwanted duplicates

            if(count <= 2) {

                nums[j] = nums[i];
                j++;

            }




        }

        return j;
    }
}