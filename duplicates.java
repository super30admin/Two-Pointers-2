class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 1) return n;

        int lastUnique = 0;
        for (int current = 1; current < n; current++) {
            if(nums[current] == nums[lastUnique]){
                //If there is no element in the left or the element on left is not equal to current element, then add the current element;
                if((lastUnique - 1 < 0) || (nums[lastUnique - 1] != nums[current])){
                    nums[lastUnique + 1] = nums[current];
                    lastUnique++;
                }
            }else{
                nums[lastUnique + 1] = nums[current];
                lastUnique++;
            }
        }
        return lastUnique + 1;
        
    }
}