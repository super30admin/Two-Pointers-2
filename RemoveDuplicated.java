//Time complexity is O(N)
//Space complexity is O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int curr=1;
        int count =1;
        int elem = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==elem){
                count=count+1;
                if(count<=2){
                    nums[curr++]=nums[i];
                }
            }
            else{
                elem = nums[i];
                nums[curr++]=nums[i];
                count=1;
            }
        }
        return curr;
    }
}