class SearchDuplicateSortedArrayII {
    //Using two pointers i and j, whenever count is more than 2 copy to j and increment j.
    //TC will be O(n), as traversing only once.
    //SC will be O(1), no extra space used.
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }

        int count = 1;
        int j=1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count<=2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args){
        SearchDuplicateSortedArrayII obj = new SearchDuplicateSortedArrayII();
        int[] nums = {1,1,1,2,2,3};
        System.out.println(obj.removeDuplicates(nums));
    }

}