class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3) return nums.length;
        int previousNumber = nums[0];
        int low = 1;
        int high = 1;
        int n = nums.length-1;
        int count =1;
        
        while(high<nums.length){
            if(nums[high]==previousNumber){
                if(count<2){
                   nums[low]=nums[high] ;
                    count++;
                    low++;
                    high++;
                }else{
                    count++;
                    high++;
                }
            }else{
                count=1;
                previousNumber = nums[high];
                nums[low]= previousNumber;
                low++;
                high++;
            }

        }
        return low;
        
    }
}