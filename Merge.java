
// Time Complexity : O(m + n) where m = no of elements in nums1 and n = no of elements in nums2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Consider two pointers and keep track of them while checking for the greater element.
//Keeping track of another pointer would store the elements accordingly in the nums1 array.

class Merge {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;

        int ind = m + n - 1;

        while (p2 >= 0 && p1 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[ind] = nums2[p2];
                p2--;
            } else {
                nums1[ind] = nums1[p1];
                p1--;
            }
            ind--;
        }
        while (p2 >= 0) {
            nums1[ind] = nums2[p2];

            ind--;
            p2--;
        }
        return nums1;
    }

    public static void main(String args[]) {
        Merge obj = new Merge();
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };

        int[] nums2 = { 2, 5, 6 };
        int n = nums2.length;
        int[] res = obj.merge(nums1, 3, nums2, n);
        for (int num : res) {
            System.out.println(num);
        }
    }
}