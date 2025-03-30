/*

Merge 2 sorted Arrays
1. Copy the first m elements of nums1 into a separate array (nums1Copy).
2. Use two pointer (p1 for nums1Copy and p2 for nums2) to compare elements.
3. Use a loop to iterate over the total size of the merged array(m+n).
4. At each step, write the smaller value from nums1Copy or nums2 into nums1.
5. Move the respective pointer (p1 or p2) forward.
6. Continue until all elements are merged into nums1.

 */


public class Problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        //Step1 : Create a copy of the first m elements of nums1
        int[] nums1Copy = new int[m];
        for(int i=0; i<m; i++){
            nums1Copy[i] = nums1[i];
            //Copying each element to avoid overwriting nums1
        }

        //Steps 2: Initialize pointers for nums1Copy (p1) and nums2 (p2)
        int p1=0; //Pointer for iterating over nums1Copy
        int p2=0; //Pointer for iterating over nums2

        //Step 3: Iterate over the total length of the merged array (m+n)
        for(int p=0; p<m+n; p++){
            //Step 4: Decide which element to take next:
            //If all elements from nums2 are used (p2 >= n), OR
            //If p1 is still
        }
    }
    
}
