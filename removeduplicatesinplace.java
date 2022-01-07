class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int count=1;
        int temp=nums[0];
        while(j<nums.length){
            if(nums[j]==temp){
                if(count<2){
                    i=i+1;
                    j=j+1;
                    count=count+1;
                    if(nums[i]!=temp){
                        nums[i]=temp;
                    }
                }else{
                    j=j+1;
                    count=count+1;
                }

            }else{
                i=i+1;
                temp=nums[j];
                if(nums[i]!=temp){
                    nums[i]=temp;
                }
                count=1;
                j=j+1;
            }


        }
        return i+1;


    }
}