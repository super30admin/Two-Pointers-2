/* we will start with the last elements for both arrays. Because the arrays are sorted. And we do not want to mess up the order.
We use 3 pointers:
1. pointing to last non-0 element in nums1 
2. pointing to last element in nums2
3. pointing to the end of the nums1 array.

1. We compare the last elements in the 2 arrays, whichever is larger, goes to the end nums1.
2. We keep adding the larger number to the end.
3. In the end, if there are some elements left in nums2, the elements are already smaller than the smallest element in nums (since we have done the comparision)
4. so we keep copying the remaining elements from nums2 to nums1 (they are already sorted)

Time complexity: O(M+N)
Space complexity: O(1)
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //
        int i = m-1; //pointing to last element in nums1
        int j = n-1; //pointing to last element in nums2
        int k = m+n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i] > nums2[j])
            {
                nums1[k] = nums1[i];
                i--;
            }
            else
            {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        } 
        //copy remaining elements from nums2
        while(j>=0)
        {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}