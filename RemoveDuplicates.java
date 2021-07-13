class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int right_pointer =1;
        int count =1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                count++;
            else
                count =1;

            if(count<=2){
                nums[right_pointer] = nums[i] ;
                right_pointer++;
            }
        }
        return right_pointer;
    }
    public static void main(String [] args){
        RemoveDuplicates r = new RemoveDuplicates();
        int [] nums = {1,1,1,2,2,2,2,2,2,3,3,3,3};

        System.out.print(r.removeDuplicates(nums));
    }
}