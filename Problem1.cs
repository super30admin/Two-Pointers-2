// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
I maintain two pointers - slow pointing at index 0 of the array and fast pointing at index 1. I initialize the count to 1 and loop through the array till fast does not exceed the array limits. If nums[slow]
equals nums[fast], I increment the count. Else set count back to 1. If count <= 2, I swap element at fast with element at slow + 1. At the end, I return slow + 1 which is the last index of the sorted
array
*/

public class Solution
{
    public int RemoveDuplicates(int[] nums)
    {
        int count = 1;
        int slow = 0, fast = 1;

        while (fast < nums.Length)
        {

            if (nums[slow] == nums[fast])
            {
                count++;
            }

            else
            {
                count = 1;
            }

            if (count <= 2)
            {
                Swap(nums, slow + 1, fast);
                slow++;
            }

            fast++;
        }

        return slow + 1;
    }

    public void Swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}