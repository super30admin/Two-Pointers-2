class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }

        int n=nums.length;
        int i=1, j=1;
        int counter=1;

        while(j<n){
            if(nums[j] == nums[j-1]){
                counter++;
            }else{
                counter = 1;
            }

            if(counter>2){
                j++;
            }else {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }
        return i;

    }
}
