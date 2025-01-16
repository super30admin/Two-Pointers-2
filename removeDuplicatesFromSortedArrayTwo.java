//TC: O(n)
//SC:O(1)
//2pointer approach i and j
class removeDuplicatesFromSortedArrayTwo {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int cnt = 1;
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            //reset the cnt if nums[i] !== nums[i - 1]
            if (nums[i] == nums[i - 1]) {
                cnt++;
            } else {
                cnt = 1;
            }
            if(cnt<=2){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;

    }
}
