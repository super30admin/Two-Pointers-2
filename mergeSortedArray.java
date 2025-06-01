//time complexity = O(m+n)
// space complexity = O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1; // this pointer is for num1 array.
        int p2 = n-1; // this pointer is for nums2 array.
        int i = (m+n) - 1; //this iterates over the num1 array.

        while(p1 >=0 && p2 >=0){
            if(nums1[p1] >= nums2[p2]){
                nums1[i] = nums1[p1];
                p1--;
            }
            else{
                nums1[i] = nums2[p2];
                p2--;
            }
            i--;
        }

        while(p2>=0){
            nums1[i] = nums2[p2];
            p2--;
            i--;
        }
    }
}