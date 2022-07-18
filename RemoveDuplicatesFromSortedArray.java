// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode: Yes
// Did you face any issues running this code: No

// Your code here along with comments explaining your approach
class RemoveDuplicatesFromSortedArray{
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;


        int count = 1, j=1;
        for(int i=1; i<nums.length; i++){

            //if the element is repeated, keep the count of no. of times it is repeated
            if(nums[i] == nums[i-1]){
                count++;
            } //if a new element is found, make its count 1
            else {
                count = 1;
            }

            //if the element has duplicates of count less than or equal to 2, copy that in the same array using a diff pointer
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        //return the length of new array removing duplicates
        return j;
    }
}