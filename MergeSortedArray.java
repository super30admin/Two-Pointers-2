
// Time Complexity : O(M + N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,7,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length-1;
        m--;
        n--;
        // Compare last element from both the arrays and place it in the bigger array from the last
        while(m>=0 && n>=0){
            // Place the bigger elements in the last
            if(nums1[m]>nums2[n]){
                nums1[k] = nums1[m];
                m--;
                k--;
            } else {
                nums1[k] = nums2[n];
                n--;
                k--;
            }
        }

        // Place all the remaining elements from nums2
        while(n>=0) {
            nums1[k] = nums2[n];
            n--;
            k--;
        }

    }
}
