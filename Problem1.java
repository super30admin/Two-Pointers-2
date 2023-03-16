// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * We keep two pointers, slow and fast. The fast pointer keeps moving as i and checks if the elements before it are the same as the current element. 
 * It increments count and keeps a track of the elements frequency. 
 * If the number isn't same as previous, we reset count to maintain count of a new element. 
 * If the count <=2, we swap the element at fast and the element at i. 
 * Return slow value at the end, to show until where our unique elements with the frequency as k stay. */
public class Problem1 {
    public int removeDuplicates(int[] nums) {
    int slow = 1; 
    int count = 1; 
    for(int i = 1; i < nums.length; i++){
        if(nums[i-1] == nums[i]){
            count++;
        }
        else{
            count = 1; 
        }
        if(count <= 2){
            nums[slow] = nums[i];
            slow++;
        }
    }
    return slow;
    }
}
