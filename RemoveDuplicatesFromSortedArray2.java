
class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow = 0;
        int i = 1;
        int count = 1;
        int k = 2;

        while(i <= n-1) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1;
            }
            if(count <= k){
                slow++;
                nums[slow] = nums[i];
            }
            i++;
        }

        return slow + 1;

    }
}