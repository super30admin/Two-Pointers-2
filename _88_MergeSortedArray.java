class Solution {

  // space complexity - o(1)
    //time - o(n+m)  where n = length of nums1 and m = length of nums2
    //Ran on leeetcode successfully : Yes
    // Problem faced  : No
    //Approach : Merge from the end of both the ararys, greater of two will go in the last index of nums1

  public void merge(int[] nums1, int m, int[] nums2, int n) {

       int pivot = n+m -1;
       int i = m-1;
       int j = n-1;

       while(pivot>=0){

           if(i < 0 || ( j>=0 && nums2[j]>= nums1[i])){
               nums1[pivot] = nums2[j];
               j--;
           }
           else{
               nums1[pivot] = nums1[i];
               i--;
           }
           pivot--;
       }
   }

  // space complexity - o(1)
    //time - o(n+m)
    //Ran on leeetcode successfully : Yes
    // Problem faced  : No
    //Approach : move all zeros in nums1 in front and then start merge two arrays
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = n+m-1;

        while(i >= 0 ){
            nums1[j] = nums1[i];
            i--;
            j--;
        }

        i = n;
        j = 0;
        int pivot = 0;

        while(i<m+n || j<n){

            if(j>=n || ( i<m+n && nums1[i] <= nums2[j]) ){
                nums1[pivot] = nums1[i];
                i++;
            }
            else if(i>= m+n || (j < n && nums1[i] > nums2[j])){
                nums1[pivot] = nums2[j];
                j++;
            }
            pivot++;
        }

    }
}
