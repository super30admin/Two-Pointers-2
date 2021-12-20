//Time Complexity: O(n)
//Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp1 = new int[m];
        for(int i = 0; i < m; i++){
            temp1 [i] = nums1[i];
        }
        int i = 0,j = 0, k =0;
        while(i < m && j < n){
            if(temp1[i] <= nums2[j]){
                nums1[k++] = temp1[i++];
            }
            else{
                nums1[k++] = nums2[j++];
            }
        }
        while(i < m){
            nums1[k++] = temp1[i++];
        }
        while(j < n){
            nums1[k++] = nums2[j++];
        }
    }
}
