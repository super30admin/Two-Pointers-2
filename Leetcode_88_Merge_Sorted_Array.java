/*
have p1 on nums1 and p2 on nums2; comapre both values, and add to the new array. 
if p1 is smaller it increments, else p2*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // base case

        int len = nums1.length;
        if (len == 0 || n == 0)
            return;

        // p1 starts at m-1 index; p2 starts at n-1 index, place starts at m+n-1 index
        int p1 = m - 1, p2 = n - 1, place = m + n - 1;

        while (p2 >= 0 && p1 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[place--] = nums1[p1--];
            } else {
                nums1[place--] = nums2[p2--];
            }
        }
        while (p2 >= 0 && place >= 0) {
            nums1[place--] = nums2[p2--];
        }
        return;
    }
}