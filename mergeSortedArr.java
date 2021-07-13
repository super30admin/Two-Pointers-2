
// Time Complexity : O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class mergeSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //base case to check if the arrays are empty or if the length of second array is 0
        if(nums1 == null || nums2 == null || n == 0)
            return;
        
        int ptr1 = m - 1, ptr2 = n - 1, curr = m + n - 1;
        
        while(ptr1 >= 0 && ptr2 >= 0){
            //check which is greater
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[curr] = nums1[ptr1];
                ptr1--;
            }
            else{
                nums1[curr] = nums2[ptr2];
                ptr2--;
            }
            curr--;
        }
        
        while(ptr2 >= 0){
            nums1[curr] = nums2[ptr2];
            curr--;
            ptr2--;
        }
    }
}