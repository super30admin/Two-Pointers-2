//Remove Duplicates from Sorted Array II
//Time Complexity->O(n)
//Space Complexity->O(1)
class Solution2 {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return -1;
        }
        int k=2;
        int slow=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
            {
                count++; //calculate total no of duplicates
            }
            else
            {
                count=1;//new element is encountered 
            }
            if(count<=2)
            {
                nums[slow]=nums[i];//i is fast pointer
                slow++;
            }

        }
        return slow;//length of the updated array
    }
}