class Solution {
    //Time complexity: O(m+n)
    //Space complexity: O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]<nums2[j]){
                nums1[k]=nums2[j];
                k--;
                j--;
            }
            else{
                nums1[k]=nums1[i];
                k--;
                i--;
            }
        }
        while(j>=0){
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    }
}