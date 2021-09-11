package TwoPointers2;
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int count=0, rIdx=0;
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                count++;
            } else{
                count=1;
            }
            if(count <= 2){
                nums[rIdx] = nums[i];
                rIdx++;
            }
        }
        return rIdx;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesFromSortedArray2().removeDuplicates(new int[]{1,1,1,2,2,2,3,4,5,6,6,6}));
    }
}
