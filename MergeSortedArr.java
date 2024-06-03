/***
 *Using 2 pointers approach
 *1. Set p1 to m-1, p2 to n-1 and p3 to m+n-1
 *2. Compare element at p1 with p2 and assign the larger element to p3
 *TC - O(m+n), SC - O(1)
 */
class MergeSortedArr {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums1 == null || nums1.length == 0)
            return;

        int p1 =m-1, p2 =n-1, p3 =m+n-1;

        while(p1 >=0 && p2 >=0) {
            if(nums1[p1] >= nums2[p2]) {
                nums1[p3] = nums1[p1];
                p1--;
            }

            else{
                nums1[p3] = nums2[p2];
                p2--;
            }

            p3--;
        }

        while(p2 >=0) {
            nums1[p3--] = nums2[p2--];
        }
    }
}