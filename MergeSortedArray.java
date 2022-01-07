/*
TIME COMPLEXITY : O(m+n) where m and n is the length of both arrays
SPACE COMPLEXITY : O(m) where m is the length that is filled of nums1
DID THIS CODE SUCCESSFULLY RUN ON LEETCODE : Yes
THREE LINE EXPLANATION OF SOLUTION IN PLAIN ENGLISH

I copied the elements of nums1 to an another aux array and then set first and
second pointer on each array aux and nums2. Moved the pointer along the minimum
value.

YOUR CODE HERE ALONG WITH COMMENTS EXPLAINING YOUR APPROACH


*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] aux = new int[m];

        for(int  i = 0; i < m; i++){
            aux[i] = nums1[i];
        }

        int first = 0;
        int second = 0;
        int i = 0;

        while(first < m && second < n){
            if(aux[first] <= nums2[second]){
                nums1[i++] = aux[first++];
            }
            else{
                nums1[i++] = nums2[second++];
            }
        }

        while(first < m){
            nums1[i++] = aux[first++];
        }

        while(second < n){
            nums1[i++] = nums2[second++];
        }

    }
}
