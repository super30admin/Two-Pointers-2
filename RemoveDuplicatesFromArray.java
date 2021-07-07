// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Here, we take an array, look upto 2 duplicates, if found more than 2, we delete it and copy array from index+1 to n-1 in index -1 to n-2
// We decrease the length and index by 1 here. If we encounter new element, we just reset count to 1
// Output the length

public class RemoveDuplicatesFromArray {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length == 0){
            return 0;
        }
        int index = 1;
        int count = 1;
        int length = nums.length;

        while(index < length){
            if(nums[index] == nums[index-1]){
                count++;

                if(count > 2){
                    delete(nums,index);
                    length--;
                    index--;
                }

            } else {
                count = 1;
            }

            index++;
        }

        return length;
    }

    private void delete(int[] nums, int index){
        for(int i = index+1; i < nums.length; i++){
            nums[i-1] = nums[i];
        }
    }
}
