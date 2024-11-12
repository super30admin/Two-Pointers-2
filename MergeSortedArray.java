// Approach : Create a result array of size m+n and use two pointers then compare and take the min and fill in the result in a sorted manner and increment the pointer. 
// Time : O(m+n)
// Space : O(m+n)

// Approach : Two Pointers iterating on the two arrays and third pointer indicating anything after that is processed completely 
// Time : O(m+n)
// Space : O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pt1= m-1;
        int pt2 = n-1;
        int index= m+n-1; // indicating all the elements on the right are well placed.
        while(pt1>=0 && pt2>=0){
            if(nums2[pt2]>nums1[pt1]){
                nums1[index]=nums2[pt2];
                pt2--;
            } else{
                nums1[index]=nums1[pt1];
                pt1--;
            }
            index--;
        }
        // pt1 can be out or pt2 can be out
        // if pt2 is not out then we have to copy the elements
        while(pt2>=0){
            nums1[index]=nums2[pt2];
            pt2--;
            index--;
        }
    }
}