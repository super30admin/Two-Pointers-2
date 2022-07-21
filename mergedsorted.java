// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


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