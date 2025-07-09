class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        int count = 0;

        while(i<nums.length)
        {
            if(i!=0 && nums[i-1]==nums[i]){
                count++;
            }
            else{
                count=1;
            }

            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}
