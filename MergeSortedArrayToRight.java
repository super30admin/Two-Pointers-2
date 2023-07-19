class MergeSortedArrayToRight{
    public void merge(int[] nums1, int[] nums2, int m, int n){
        int indx= m+n;
        int p1 = m-1;
        int p2 = n-1;
        while(p1>=0 && p2 >=0){
            if(nums1[p1] >= nums2[p2]){
                nums1[indx] = nums1[p1];
                p1--;
            }else{
                nums1[indx] =  nums2[p2];
                p2--;
            }
            indx--;
        }

        while(p2>=0){
            nums1[indx] = nums2[p2];
            p2--;
            indx--;
        }
    }
}