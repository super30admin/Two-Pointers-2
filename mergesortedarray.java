time complexity: O(m+n)
space complexity: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int end = m+n-1; //initialising two pointers at both ends of array
        int end1 = m -1;
        int end2 = n -1;

        while(end2 >= 0){
            if(end1 >=0){ //comparing which element is less, then putting into first array
                nums1[end--] = nums1[end1] > nums2[end2] ? nums1[end1--] : nums2[end2--];
            }else{
                nums1[end--] = nums2[end2--];
            }
        }

    }
}