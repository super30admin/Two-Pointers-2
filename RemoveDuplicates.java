class Solution {
    public int removeDuplicates(int[] nums) {
        int l=nums.length;
        int count=1;

        int slow=1;
        for(int j=1;j<l;j++){

            if(nums[j]==nums[j-1]){
                count++;

            }else{
                count=1;
            }
            if(count<=2){
                nums[slow]=nums[j];
                slow++;
            }

        }
        return slow;
    }
}