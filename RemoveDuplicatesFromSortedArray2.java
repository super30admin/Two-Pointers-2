
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english 

// Your code here along with comments explaining your approach
// We use a pointer `j` to mark the position of the next valid element to place.
// A counter tracks how many times the current number has been seen consecutively.
// If a number appears more than twice, we skip placing it in the result array.
// Initialize `j = 1` as the index to write the next valid element, and `count = 1` to track consecutive duplicates.
// Iterate through the array from index 1.
// If the current element is the same as the previous one, increment `count`; else, reset `count` to 1.
// If `count <= 2`, it means the number has appeared at most twice, so place it at index `j` and increment `j`.
// At the end, return `j`, which is the new length of the array with duplicates allowed at most twice.




public class RemoveDuplicatesFromSortedArray2 {
    public int solve(int [] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        int j = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count=1;
                
            }
            if(count <= 2){
                nums[j] = nums[i];
                j++;

            }
        }
        return j;

    }
    public static void main(String[]args){
        RemoveDuplicatesFromSortedArray2 ob = new RemoveDuplicatesFromSortedArray2();
        int[] nums = {1,1,1,2,2,3};
        int[] nums1 = {0,0,1,1,1,1,2,3,3};

        System.out.println(ob.solve(nums));
        System.out.println(ob.solve(nums1));

    }
    
}
