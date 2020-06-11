class Solution {
    public int removeDuplicates(int[] nums) {
       if (nums.length<3)
            return nums.length;
        
        int ptr= 0, n= nums.length;
        for (int i=0; i<n-2;i++)
        {
            if (nums[i] != nums[i + 2])
            {    
                nums[ptr]=nums[i];
                ptr++;
            }
        }
        nums[ptr++] = nums[n-2];
        nums[ptr++] = nums[n-1];
        
        return ptr;
}
}