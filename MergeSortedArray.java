// Time Complexity : O(m+n)
// Space Complexity : O(m+n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Here, we go one by one, compare the front elements of an array and store it in new array
public class MergeSortedArray {
    public void mergeBruteForce(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[m+n];

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                ans[k] = nums1[i];
                i++;
                k++;
            } else {
                ans[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < m){
            ans[k] = nums1[i];
            i++;
            k++;
        }

        while(j < n){
            ans[k] = nums2[j];
            j++;
            k++;
        }

        for(int x = 0; x < m+n; x++){
            nums1[x] = ans[x];
        }
    }
}
