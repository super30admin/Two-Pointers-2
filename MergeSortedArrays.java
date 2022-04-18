class MergeSortedArrays {


// Time Complexity :0(m+n) where m is the no of rows and n is the no. of columns
// Space Complexity :0(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 =m-1;
        int p2 = n-1;
        int p3 = m+n -1;
        while(p1 >=0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[p3] = nums1[p1];
                p1--;
            }
            else{
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }
        while(p2 >= 0){
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}