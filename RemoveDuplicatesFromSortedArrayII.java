class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        if(n==1)
        return 1;
        int slow=1;
        int fast=1;
        int count=1;
        while(fast<n)
        {
            if(nums[fast]==nums[fast-1])
            count++;
            else{
                count=1;
            }
            if(count <= 2)
            {
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }

       return slow;
    }
}

//tc: O(n)
//sc: O(1)