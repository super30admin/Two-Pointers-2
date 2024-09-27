//time complexity: O(m+n)
//space complexity: O(1)

class MergeSolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j= n-1;
        int k = m + n - 1;
        while (k >=0 && j>=0)
        {
          if (i >= 0 && nums1[i] >= nums2[j])
            {               
                nums1[k] = nums1[i];
                nums1[i] = 0;
                i--;
            }
            else
            {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
       
        }
    }
}