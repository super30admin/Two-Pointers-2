class RemoveDuplicateInSortedArray {
    //Complexity time : O(n)
    //space : O(1)
    public int removeDuplicates(int[] nums) {
        int slow =1;
        int count = 1;
        int k=2;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count =1;
            }
            if(count<=k){
                nums[slow] = nums[i];
                slow ++;
            }
        }

        return slow;
    }
}