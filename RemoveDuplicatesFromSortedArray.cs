// Time Complexity:
// O(n)

// Space Complexity:
// O(1)

//Approach
// Keep slow pointer at index 0 , for loop Starts with index 1 ,
// if the previous and the current elements are same increment count.
// if the the elements are unequal reset the count to 1.
// if count is less than 0 equal to 2 or k , update slow pointer with current vals.
// Increment slow pointer.
public class Solution
{
    public int RemoveDuplicates(int[] nums)
    {
        int slow = 1;
        int count = 1;
        for (int i = 1; i < nums.Length; i++)
        {
            if (nums[i] == nums[i - 1])
            {
                count++;
            }
            else
            {
                count = 1;
            }
            if (count <= 2)
            {
                nums[slow] = nums[i];
                slow++;
            }

        }
        return slow;
    }
}







