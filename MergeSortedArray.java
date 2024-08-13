// we start at the end of the mth index (m-1) for nums1
// and for nums2 , we start at n-1.
// the idea is not to mess up the array. if we start from the start at both the arrays, the swapping of numbers will be a problem.
// Time complexity = O(n)
// space complexity = O(1)
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;// last element of  nums1 array.
        int j= n-1; // last element of nums2 array
        int k= m+n-1;// last index of nums1 array.
        while(i>=0 && j>=0) {
            if(nums1[i]>= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        // what if one of the array reaches its end.
        // still I need to copy the stuff in nums1.
        // we don't need to chdck for index i since nums1 will not get exhausted but nums2 will.
        // nums1 is greater than nums2 (in terms of length).

        // case where nums1 (index i) is exhausted.
        while(j>=0) {
            nums1[k--] = nums2[j--];
        }
        
        
    }
}