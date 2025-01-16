class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0){
            return;
        }

        int p1=m-1, p2=n-1, p3=m+n-1;

        while(p2>=0 && p1>=0){
            if(nums1[p1] > nums2[p2]){
                nums1[p3] = nums1[p1];
                p3--;
                p1--;
            } else {
                nums1[p3] = nums2[p2];
                p3--;
                p2--;
            }
        }

        while(p2>=0){
            nums1[p2] = nums2[p2];
            p2--;
        }
    }
}
