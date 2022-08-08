// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

class RemoveDuplicatesInArray {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int count =1, ptr=1;
        int numOfDuplicacy = 2;

        //here we'll be incremeting count if the previous element is same as current if not then reset count to 1.
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                count++;
            } else {
                count = 1;
            }

            // ptr pointer will help to keep track that any number is printed upto allowed numOfDuplicacy number in the array.
            if(count <= numOfDuplicacy ){
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return ptr;
    }
}