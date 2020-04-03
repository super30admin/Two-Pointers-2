// Time Complexity : O(m+n)m=number of elements in first array .  n=number of elements in second array . 
// Space Complexity : O(1) traverse same array and sort in place.  
// Did this code successfully run on Leetcode :yes. 

// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//Success
//Details 
  /**
   * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array. Memory
   * Usage: 39.8 MB, less than 5.94% of Java online submissions for Merge Sorted Array.
   *
   * @param nums1
   * @param m
   * @param nums2
   * @param n
   */
  // o(m+n);
  public void merge(int[] nums1, int m, int[] nums2, int n) {
        int current=m+n;
        int tmp1=0;
        int tmp2=0;
        while (current>0){
            if (m>0){
                tmp1=nums1[m-1];
            }else {
                tmp1=Integer.MIN_VALUE;
            }

            if (n>0){
                tmp2=nums2[n-1];
            }else {
                tmp2=Integer.MIN_VALUE;
            }

            if (tmp1>tmp2){
                nums1[current-1]=tmp1;
                m--;
            }else {
                nums1[current-1]=tmp2;
                n--;
            }
            current--;
        }

    }


    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
   // Memory Usage: 40 MB, less than 5.94% of Java online submissions for Merge Sorted Array.
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1,p2=n-1;
        int indSorted=m+n-1;
        while (p1>=0&& p2>=0){
            if (nums2[p2]>nums1[p1])
                nums1[indSorted--]=nums2[p2--];
            else
                nums1[indSorted--]=nums1[p1--];
        }
        while (p2>=0)
            nums1[indSorted--]=nums2[p2--];

    }