// O(n) time, since we process each element once
// O(1) space - overwrite directly

class Solution {
    public int removeDuplicates(int[] nums) {
        // initialize counter and second pointer
        int j = 1;
        int count = 1;
        
        // start from second element of array and iterate
        for (int i = 1; i < nums.length; i++){
            
            // if current element is duplicate, increment count
            if (nums[i] == nums[i-1]){
                count++;
            }
            
            else{
                count = 1; // reset count
            }
            
            if (count <= 2){
                nums[j] = nums[i]; // copy element over and thus overwrite element at index j
                j++;
            }
        }
        return j;
    }
}