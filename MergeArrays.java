public class MergeArrays {
        // Idea is to start the merge from the end of the array so to avoid overwriting elements in nums1 
        // which are not processed
        // compare the elements in nums2[] with nums1[] and replace the elements in nums1[]
        // and then move the pointers accordingly 

        //Time Complexity: O(n)
        //Space Complexity: O(1)
        public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1;
        int idx = m+n-1;

        while(p1 >= 0 && p2 >=0){
            if(nums2[p2] > nums1[p1]){
                nums1[idx] = nums2[p2];
                p2--;
            }else{
                nums1[idx] = nums1[p1];
                p1--;
            }
            idx--;
        }

        while(p2 >= 0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}
