//Time Complexity:O(N)
//Space Complexity:O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int count =1;
        int i = 1;
        int j=1;
        if(nums.length<=2){
            return nums.length;
        }else{
            while(j<=nums.length-1){
                if(nums[j] == nums[j-1]){
                    count++;
                }else{
                    count=1;
                }
                if(count<=2){
                    nums[i++]=nums[j++];
                }else{
                    while( j<nums.length && nums[j-1] == nums[j] ){
                        j++;
                    }
                }
            }
        }

        return i;
    }
}