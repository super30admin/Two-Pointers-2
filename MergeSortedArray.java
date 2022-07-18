// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode: Yes

// Three-line explanation of solution in plain English:
// Assign 3 pointers, one at the mth length, one at the nth length and one at the m+nth length
// traverse nums1 from the end, append greater element(comparing nums1 and nums2)
// and decrement the pointers of the array that had the greater element

// Your code here along with comments explaining your approach
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer3 = nums1.length-1;
        int pointer1 = m-1;
        int pointer2 = n-1;
        while(pointer1>=0 && pointer2>=0) {
            if(nums1[pointer1]>=nums2[pointer2]){
                nums1[pointer3--] = nums1[pointer1--];
            }else{
                nums1[pointer3--] = nums2[pointer2--];
            }
        }
        while(pointer2>=0){
            nums1[pointer3--] = nums2[pointer2--];
        }
    }
}