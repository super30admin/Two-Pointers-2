
// Time Complexity : O(n)
// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
Maintaing 2 pointers and count variable to maintain duplicacy of elements upto 2 only.

Slow pointer and fast pointer

Fast will check if number is previous is same as current or not and will change the value of count and when get new element, reset the count to 1.

Whenever count <= 2, increase the slow pointer and copy element from fast to small index

Till end of array we will do this process   
*/
// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
     if(nums == null)    return -1;
        
        int i = 0, fast = 1, count = 1;
        int k = 2;
        while(fast < nums.length && i < nums.length){
            if(nums[fast] == nums[fast - 1]){
                count++;
            }else{
                count = 1;
            }
            
            if(count <= k){
                i++;
                nums[i] = nums[fast];
            }
            fast++;
        }
        return i+1; // index of slow pointer   
    }
}
