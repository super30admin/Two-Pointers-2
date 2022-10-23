package S30_Codes.Two_Pointers_2;

// Time Complexity = O(n) // n = nums.length
// Space Complexity = O(1)
// Two-Pointers-2 (v0)

class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        int curIdx = 0;

        while(curIdx < nums.length){

            int element = nums[curIdx];
            int count = 0;

            while(curIdx < nums.length && nums[curIdx] == element){
                count++;
                curIdx++;
            }

            nums[idx++] = element;
            if(count > 1)
                nums[idx++] = element;

        }
        return idx;
    }
}