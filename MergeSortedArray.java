class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m+n-1;
        int j = n-1;
        int k = m-1;
        
        while(j >= 0 && k >= 0){
            if(nums1[k]<nums2[j]){
                nums1[i] = nums2[j];
                i--;
                j--;
            }
            else{
                nums1[i] = nums1[k];
                k--;
                i--;
            }
        }
        while(j >= 0){
            nums1[i] = nums2[j];
                i--;
                j--;
        }
    }
}
