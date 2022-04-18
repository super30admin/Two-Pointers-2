// Time Complexity : O(m+n) lengths of 2 arrays
// Space Complexity : O(1) storing in the same array
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : start at end of the arrays,
// insert the loer element in the bigger array and transfer remaining elements from the smaller array if present

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null && nums2 == null) return;

        int i = m+n-1;
        m = m-1;
        n = n-1;
        while(m>=0 && n>=0){
            if(nums1[m]<nums2[n])
                nums1[i--] = nums2[n--];
            else
                nums1[i--] = nums1[m--];
        }

        //remaining elements in nums2
        while(n>=0)
            nums1[i--] = nums2[n--];

    }
}
