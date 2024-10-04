class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(k!=0 && nums[k-1]==nums[i]){
                if(k>1 && nums[k-2]==nums[k-1]){                  
                    continue;
                }
                else{
                    nums[k++]=nums[i];
                }
            }
            else nums[k++]=nums[i];
        }
        return k;
    }
}
