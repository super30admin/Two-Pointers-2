//SC : O(1);
//TC : O (m*n);
//Approach : Basically copy the 2nd array into the first array but start at the last indiex of 1st and 2nd array and compare with the last sorted element of thefirst array.
//Once done comparing , check if the 2nd array is empty, if not then fill the remaining elements in decending order

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = m+n-1;
        int nums1Length = m+n-1;
        while(m > 0 && n >0)
        {
            if (nums1[m-1] < nums2[n-1])
            {
                nums1[k] = nums2[n-1];
                n--;

            }
            else {
                nums1[k] = nums1[m-1];
                m--;
            }
            k--;
        }

        while(n >0)
        {
            nums1[k] = nums2[n];
            k--;
            n--;
        }

    }
}