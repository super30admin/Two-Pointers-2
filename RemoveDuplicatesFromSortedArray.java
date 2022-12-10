// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class RemoveDeplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int prev = -9999;
        int cnt = 0;
        int idx = 0;

        for (int num : nums){
            if (num != prev){
                nums[idx] = num;
                idx++;
                cnt =0;
            } else {
                cnt++;
                if (cnt <2){
                    nums[idx] = num;
                    idx++;
                }
            }
            prev = num;
        }
        return idx;
        
    }
}