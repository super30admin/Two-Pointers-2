
// Time Complexity : O(m+n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
publi class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int index = m+n -1;

        while(p1>=0 && p2 >=0) {

            if(nums1[p1] > nums2[p2]){
                nums1[index] = nums1[p1];
                p1--;
            }
            else {
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }

        // when p2 remains and p1 is fnished, copy the elements of p2 to p1
        while(p2 >= 0) {
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }

    }
}