class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = nums1.length - 1;
        int k = nums2.length - 1;
        while(i>=0 && k>=0){
            if(nums1[i] < nums2[k]){
                nums1[j] = nums2[k];
                j--;
                k--;
            }else{
                nums1[j] = nums1[i];
                j--;
                i--;
            }
        }
        while(k >= 0){
            nums1[j] = nums2[k];
            j--;
            k--;
        }
    }
}


// Time Complexity : O(n + m)
//  Spcae Complexity : O(1)