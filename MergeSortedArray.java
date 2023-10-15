/* Time Complexity : O(m+n)
 * 	m+n - total length of the input array - n1 */
/* Space Complexity : O(1) */
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :

//Two Pointer

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int idx = m + n -1;

        while(p1 >= 0 && p2 >= 0){
            //If p1>p2, copy p1 at idx and move p1 and idx to the left
            if(nums1[p1] > nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--;
                idx--;
            }else{//If p1<=p2, copy p2 at idx and move p2 and idx to the left
                nums1[idx] = nums2[p2];
                p2--;
                idx--;
            }
        }
		//when P2 goes to -1 and P1 is >= 0, ==> do nothing
        //when P1 goes to -1 and P2 is >= 0, ==> copy the remaining elements from nums2 to nums1 by moving p2 and idx to left
        while(p2 >= 0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}