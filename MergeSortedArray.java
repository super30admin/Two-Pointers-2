//Time Complexity : O(M+N)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode :  yes
// Three line explanation of solution in plain english

/*
    Input:
    nums1 = [1,2,3,0,0,0], m = 3
    nums2 = [2,5,6],       n = 3

    Output: [1,2,2,3,5,6]
*/
class Solution {
    public void merge(int[] ar1, int m, int[] ar2, int n) {
        if(ar2==null){
            return;
        }
        int i=m-1;
    int j=n-1;
    int k=m+n-1;
    while(i>=0 && j>=0){
      if(ar1[i]>ar2[j]){
        ar1[k]=ar1[i];
        i--;
      }else{
        ar1[k]=ar2[j];
        j--;
      }
      k--;
    }
    while(j>=0){
      ar1[k]=ar2[j];
      j--;
      k--;
    }
    }
}