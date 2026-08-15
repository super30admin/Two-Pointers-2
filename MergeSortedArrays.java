//Approach: Since both the arrays are sorted, if we keep pointers at the end and do the iterations for a better time complexity and space complexity
//Time Complexity : O(m) + O(m+n)
//Space Complexity: O(m)

class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int ptrOne = m-1;
        int ptrTwo = n-1;
        int i = m+n-1;

        //Since the arrays are sorted if we keep pointers at the end of the arrays, it will be easier to compare and populate
        while(ptrOne >= 0 && ptrTwo >= 0)
        {
            if(nums1[ptrOne] > nums2[ptrTwo])
            {
                nums1[i] = nums1[ptrOne];
                ptrOne--;
            }
            else
            {
                nums1[i] = nums2[ptrTwo];
                ptrTwo--;
            }
            i--;
        }
        // In case if ptrOne reaches 0 and ends the earlier loop, we copy the rem
        while(ptrTwo>= 0)
        {
            nums1[i] = nums2[ptrTwo];
            ptrTwo--;
            i--;
        }
    }
}