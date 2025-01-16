public class Solution
{
    public int RemoveDuplicates(int[] nums)
    {
        int i = 1, j = 1;
        int count = 1;

        while (i < nums.Length)
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
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}