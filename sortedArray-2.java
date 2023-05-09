class SortedArr {
    public static void main(String[] args) {
       SortedArr result = new SortedArr();
       int[] nums = {1,1,1,1,2,2,3};
       result.sortArr(nums);
    }

    public void sortArr(int[] nums) {
        int j = 1;
        int count = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count+=1;
            }

            else {
                count = 1;
            }

            if(count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }

    }
}