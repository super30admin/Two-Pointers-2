class Problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = n-1;
        int p1 = m-1;
        int p2 = m+n-1;
        if(nums1 == null || nums1.length == 0) return;
        while(p>=0 && p1>=0){
            if(p>=0 && nums2[p] >= nums1[p1]){
                nums1[p2] = nums2[p];
                p--;
                p2--;
            }
            else if(p1>=0 && nums1[p1] > nums2[p]){
                nums1[p2] = nums1[p1];
                p2--;
                p1--;
            }
        }
        while(p>=0){
            nums1[p2]=nums2[p];
            p--;
            p2--;
        }
    }
}