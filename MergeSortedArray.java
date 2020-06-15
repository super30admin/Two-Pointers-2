// Bruteforce solution
//Time complexity for this solution is O(n logn + n) and space complexity is O(1)
class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    if(m == 0 && n == 0)
      return;
    for(int i=0;i<n;i++){
      nums1[m+i] = nums2[i];
    }
    Arrays.sort(nums1);
  }
}

// Optimal solution
//Time complexity for this solution is O( m + n) and space complexity is O(1)

class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m-1, j= n-1,k=m+n-1;
    while(i >= 0 && j >=0){
      if(nums1[i] > nums2[j]){
        nums1[k] = nums1[i];
        i--;
      }
      else{
        nums1[k] = nums2[j];
        j--;
      }
      k--;
    }
    while(j>=0){
      nums1[k] = nums2[j];
      j--;k--;
    }
  }

}