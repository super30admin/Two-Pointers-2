//Time - O(m+n)
//Space - O(1)
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, p3 = nums1.length-1;

        while(p1>=0 && p2>=0){
            nums1[p3] = Math.max(nums1[p1],nums2[p2]);
            p3--;
            if(nums1[p1] > nums2[p2]){
                p1--;
            } else {
                p2--;
            }
        }

        while(p2>=0){
            nums1[p3] = nums2[p2];
            p3--;
            p2--;
        }
    }
}