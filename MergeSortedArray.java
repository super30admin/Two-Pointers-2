class MergeSortedArray {
    
    // Time Complexity: O(m+n)
    // Space Complexity: O(1)
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalLength = m + n - 1;
        m--;
        n--;

        // We start traversing from the end of both the arrays
        while(m >= 0 && n >= 0){
            // We check for the greater number between two numbers of the array and place it at the current last position in the nums1 array.
            if(nums1[m] > nums2[n])
                nums1[totalLength--] = nums1[m--];
            else
                nums1[totalLength--] = nums2[n--];
        }
        
        // If there are still elements remaining in the nums2 array - we transfer it to nums1
        while(n >= 0)
            nums1[totalLength--] = nums2[n--];
    }
}