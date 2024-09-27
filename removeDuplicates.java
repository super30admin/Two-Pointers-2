//time complexity: O(n)
//space complexity: O(1)

class RemoveDuplicatesSolution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int n: nums)
        {
            if(i < 2 || nums[i-2] != n)
            {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}