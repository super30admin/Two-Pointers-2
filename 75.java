//o(nlogn)
class Solution
{
    public void sortColors(int[] nums) 
    {
        if(nums==null||nums.length==0) return;
        
        int l=0,m=0;
        int h =nums.length-1;
        
        while(m<=h)
        {
            if(nums[m]==0)
            {
                swap(nums, m, l);
                l++;
                m++;
            }
            else if(nums[m]==1)
            {
                m++;
            }
            else
            {
                swap(nums, m, h);
                h--;
                
            }
        }
       
    }
     private void swap(int[]nums, int i, int j)
        {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
}