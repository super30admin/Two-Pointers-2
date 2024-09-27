class Solution {
    // Brute Force Approach
    // Space Complexity: O(m+n) as we create result array for the same.
    // Time Complexity: // Need to discuss 
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=0, j=0, k=0;
        int[] result = new int[m+n];

// Traverse through nums1 & nums2 until m & n respectively
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                result[k]=nums1[i];
                i++;
            }
            else {
                result[k]=nums2[j];
                j++;
            }
            k++;
        }
        // Traverse if any pending elements in nums1
        while(i<m)
        {
          result[k] = nums1[i];
          k++;
          i++;
        }
         // Traverse if any pending elements in nums2
        while(j<n)
        {
           result[k] = nums2[j];
           k++;
           j++;
        }

// Result array has the final result , add it to nums1
        for(int l=0;l<result.length;l++)
        {
            System.out.println(result[l]);
        }
        for(int l=0;l<nums1.length;l++)
        {
          nums1[l] = result[l];
        }
        //nums1 = result;
        
    }
}
