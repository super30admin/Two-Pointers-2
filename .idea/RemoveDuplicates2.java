public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        int count =1;
        int i=1;
        int j=1;
        while(i<nums.length)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
                count=1;
            if(count<=2)
            {
                nums[j]=nums[i];
                i++;
                j++;
            }
            else
                i++;
        }
        return j;
    }
    public static void main(String args[])
    {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        RemoveDuplicates2 ob = new RemoveDuplicates2();
        System.out.println(ob.removeDuplicates(nums));
    }
}

//time complexity is O(n)
//space complexity is O(1)