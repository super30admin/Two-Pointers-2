// time complexity - O(n)
// space complexity - O(1)
public class Solution
{
    public int RemoveDuplicates(int[] nums)
    {
        int n = nums.Length;
        int count = 1;
        int slowPtr = 1;
        for (int i = 1; i < n; i++)
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
                nums[slowPtr] = nums[i];
                slowPtr++;
            }
        }
        return slowPtr;
    }
}