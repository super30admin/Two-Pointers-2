// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :no
// Any problem you faced while coding this : yes, didnt pass test some cases
class MergeSortedArrayAttempt {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        while(p2>=0 && p1>=0){
            if(nums2[p2]>nums1[p1]){
                nums1[p1+p2+1] = nums2[p2];
                p2--;
            }
            else{
                nums1[p1+p2+1] = nums1[p1];
                p1--;
            }

        }

    }
}
