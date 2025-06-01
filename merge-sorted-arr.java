//T.C: O(n) n: length of nums1[]
//S.c: O(1) No extra data structure is used except few variables to store my pointers which is constant.

/*Approach: use two pointers each at the last element in both nums1[] and nums2[]. compare the elemenst at the pointers and accordingly update the pointers.
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1,index = m+n-1;

        while(i >= 0 && j >= 0){
            if(nums2[j] > nums1[i]){
                nums1[index] = nums2[j];
                j--;
            }else{
                nums1[index] = nums1[i];
                i--;
            }
         index--;
        }
        while(j >=0){
            nums1[index] = nums2[j];
            j--;
            index--;
        }
    }
}