

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int insert = 0;
        int i = 0;
        while (i<nums.length)
        {
            int count = 0;
            int elem = nums[i];
            while(i<nums.length && elem == nums[i])
            {
                ++i;
                ++count;
            }
            
            if (count > 2)
                count = 2;
            while(count != 0)
            {
                nums[insert] = elem;
                insert++;
                count--;
            }
        }
        return insert;
        
    }
}