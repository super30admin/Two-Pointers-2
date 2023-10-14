//Time Complexity: O(m+n)
//Space Complexity: O(1)


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        int n = nums.length;
        int slow =0;
        int count = 0;
        for (int i =0; i<n; i++)
        {
            if(i==0 || nums[i]!= nums[i-1])
            {
                count = 1;
            }
            else
            { count++;}
                if(count <= 2)
                {
                    nums[slow] = nums[i];
                    slow++;
                }
            }
            return slow;
        }  
    }
