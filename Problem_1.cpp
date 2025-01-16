// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 80: Remove duplicates from sorted array ii
// Approach: 80	Remove duplicates from sorted array ii
// Time Complexity: O(n)

class Solution
{
public:
    int removeDuplicates(vector<int> &nums)
    {
        // Base Case
        if (nums.empty())
        {
            return 0;
        }

        int count = 1;

        // Init Pointers
        int j = 1;

        // Loop around the nums array, pointer i will be moving forwards and j will be pointing the place where the element has to be placed
        for (int i = 1; i < nums.size(); i++)
        {

            // If number is the same as previous index increase the counter
            if (nums[i] == nums[i - 1])
            {
                count++;
            }

            // If not set it to 1 indicating occurance of the new element
            else
            {
                count = 1;
            }

            // If count is in range then place the element
            if (count <= 2)
            {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
};