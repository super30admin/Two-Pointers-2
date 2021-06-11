
//time complexity:O(n)
//space complexity:O(1) 
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int k=2;
        int i=1;
        int m=nums.length-1;
        for(int j=1;j<=m;j++)
        {
            if(nums[j]==nums[j-1])
            {
                count ++;//if the previous element is same
                //then increase the count by 1
            }
            else
            {
                count=1;//else reset the counter
            }
            if(count<=k)
            {
                nums[i]=nums[j];// replace the elements if 
                //the count <=k
                i++; //increment pointer to the next element to check
                //whether it is equal or not
            }
        }
        return i;
    }
}
