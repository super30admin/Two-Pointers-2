
// Time Complexity : O(n), where n is the size of the input array
// Space Complexity :O(1),  not using any extra space
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
//1. Take 2 pointers (i and j), one for iterating over all the elements and one to identify the desired position of an element
//2. Also take a counter to count the occurences of each elememt.
//3. If count is less than or equal to 2 (or allowed duplicates + 1), replace the element at j index with element at i index (defining
        // the correct position of element at index i) and move forward the j index. keep doing this till all elements are traversed

// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        
        //return 0, if nums is null or empty
        if(nums == null || nums.length == 0) return 0;
        //to keep count of number of occurences of each element
        int count =1;
        //represents the current element
        int i =1;
        //represents the desired position of an element
        int j=1;
        
        //keep iterating till i and j doesn't reach the end of array
        while(i<nums.length && j<nums.length){
            //check if current and the previous element are same
            if(nums[i] == nums[i-1]){
                //if yes, you found a duplicate, so increase the count
                count++;
            }
            else{
                //if not, then reset the count to 1, meaning you got an unique element
                count=1;
            }
            
            //then check if the count of the element is less than or equal to 2(max occurences of an element allowed)
            if(count<=2){
                //if yes, the place the element to its correct position that is at j
                nums[j] = nums[i];
                //and then increment j
                j++;
            }
            //at every step, increment i
            i++;
        }
        //j represents the size of the new array with at max one duplicate
        return j;
    }
}