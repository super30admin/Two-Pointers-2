// TC: O(m+n)
// SC: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length==0) return;
        // initialising 3 pointers
        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;
        // run till pointers go out of bounds
        while(p1>=0 && p2>=0){
            // store the greater of the two numer in p3
            if(nums1[p1]>nums2[p2]){
                nums1[p3] = nums1[p1];
                p1--;
            }
            else{
                nums1[p3] = nums2[p2];
                p2--;
            }
            
            p3--;
        }
        // copy the remaining elements in array nums2 to nums1
        while(p2>=0){
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}