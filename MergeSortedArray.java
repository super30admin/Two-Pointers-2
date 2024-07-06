//Time Complexity: O(m + n)
//Space Complexity: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1Pointer = m -1;
        int num2Pointer = n - 1;
        int index = m + n -1;
        while(num1Pointer >= 0 && num2Pointer >= 0) {
            if(nums1[num1Pointer] >= nums2[num2Pointer]) {
                nums1[index] = nums1[num1Pointer];
                num1Pointer--;

            }
            else {
                nums1[index] = nums2[num2Pointer];
                num2Pointer--;

            }
            index--;
        }
        while(num2Pointer >= 0) {
            nums1[index] = nums2[num2Pointer];
            index--;
            num2Pointer--;
        }


    }
}