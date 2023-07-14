class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mp = m-1;
        int np = n-1;
        int idx = m+n-1;

        while(mp>=0 && np>=0){
            if(nums1[mp]>=nums2[np]){
                nums1[idx] = nums1[mp];
                mp--;
            }else{
                nums1[idx] = nums2[np];
                np--;
            }
            idx--;
        }

        while(np>=0){
            nums1[idx]= nums2[np];
            np--; idx--;
    }
    }
}