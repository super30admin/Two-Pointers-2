// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 0 || nums2.length == 0){
            return;
        }

        m--;
        n--;
        int index = nums1.length - 1;

        while(index >= 0){
            if(m == -1){
                nums1[index] = nums2[n];
                n--;
                index--;
            }else if(n == -1){
                nums1[index] = nums1[m];
                m--;
                index--;
            }else if(nums1[m] > nums2[n]){
                nums1[index] = nums1[m];
                m--;
                index--;
            }else{
                nums1[index] = nums2[n];
                n--;
                index--;
            }
        }
    }
}
