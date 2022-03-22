/*
// Time Complexity :  O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :  Yes

*/

public class remove_Duplicate {

    public int removeDuplicates(int[] nums) {

        // as array is sorted we can use pointers.
        // it will count same how many time same number has in the array.
        int count = 1;

        // taking pointers to swap the elements

        int slow = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {

                count++;
            }
            // if we found new number then changing count of that/
            else {

                count = 1;
            }
            // assign elemetn to slow pointer and incremented it .
            if (count <= 2) {

                nums[slow] = nums[i];
                slow++;

            }
        }

        return slow;

    }
}
