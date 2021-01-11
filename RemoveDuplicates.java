
// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Initially I didn't do generic solution where count allowed could be k, hence it was less dynamic

//generic solution for if count allowed is k (here k=2)
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        if(nums == null || nums.length == 0)
            return -1;

        int count = 1, j = 1;

        //compare element with previous & put in array till count allowed is reached
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }

            //can replace 2 with k if count allowed is k
            if(count<=2){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}