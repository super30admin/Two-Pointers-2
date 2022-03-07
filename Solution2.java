/*
    Time Complexity : O(n)
    Space Complexity : O(1)
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        
        for(int p = m + n - 1; p >= 0 && j>=0 ; p--)
        {
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[p] = nums1[i];
                i--;
            }else{
                nums1[p] = nums2[j];
                j--;
            }   
        }
    }
}
