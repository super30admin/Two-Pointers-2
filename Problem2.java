class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, i = m+n-1;
        while(p1 >= 0 && p2 >= 0){
            //compare
            if(nums1[p1] >= nums2[p2]){
                nums1[i--] = nums1[p1--];
            }else
                nums1[i--] = nums2[p2--];
        }
        while(p2 >= 0){
            nums1[i--] = nums2[p2--];
        }
    }
}
//time - O(M+N)
//space - O(1)