// Time complexity: O(N), where N is the length of nums array. 
// Space complexity: O(1).
// Did this code run on leetcode: Yes

class Solution1 {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int num = nums[0];
        int count = 1; 
        for (int j = 1; j < nums.length; j++) {
            // if current element is equal to prev element, increase count.
            if (nums[j] == num) {
                count++;
            } else {
                //copy the element to start.
                nums[start++] = num;
                // if count is greater than or equal, copy the element to start once more. 
                if (count >= 2) {
                    nums[start++] = num;
                }
                // reset the count
                count = 1;
                // change the num value
                num = nums[j];
            }
        }
        // check after for loop for last unique element
        nums[start++] = num; 
        if(count >= 2) {
            nums[start++] = num; 
            
        }
        return start; 
    }
}