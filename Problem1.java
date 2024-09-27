// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

//Approach: 
//Since the array is sorted, put the first two elements at the same position in the resulting array.
//from third element onwards, find the next distinct element in the original array(i.e. this element should not be equal to the element which is two elements before it)
//move the distinct element in it's correct position(have another pointer to take care of this)

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; //new pointer, to keep track of the resulting array length
        for (int n : nums) //for each element in the given array
        if (i < 2 || n > nums[i - 2]) //copy first two elements, if nth element is not same(greater than) as (n-2)th element
            nums[i++] = n;  //add that element in it's proper position ->pointed at by i
        return i;
    }
}
