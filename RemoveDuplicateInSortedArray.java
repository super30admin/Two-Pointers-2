// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Here we will be iterating over the array and at every index we will check if the values at (i+1)th and (i-1)th index are equal or no. if they are equal that means there are more then 2 similar elements and we will keep on iterating till the time we find a condition where the i-1 and i+1 indexes are not equal . that actually means that we have encountered a unique element and this way we make sure that we are maintaing the length of the array with maximum two enteries of each element. 
public class RemoveDuplicateInSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                count++;
            else
                count = 1;
            if (count <= 2) {
                slow++;
                nums[slow] = nums[i];
            }
        }
        return slow + 1;
    }
}
