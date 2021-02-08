class removeduplicatesfromsortedarray {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int j=1;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count+=1;
            }
            else{
                count=1;
            }

            if(count<=2){
                nums[j]=nums[i];
                j+=1;
            }
        }
        return j;
    }
}
//time complexity = o(n)
//space complexity= o(1)