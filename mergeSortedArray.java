//Time complexity: O(m + n)
//Space complexity: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1;
        int ptr2 = n-1;
        int i = m + n - 1;
        while(ptr1 >= 0 && ptr2 >= 0) {
            if(nums1[ptr1] > nums2[ptr2]) {
                nums1[i] = nums1[ptr1];
                ptr1--;
            }
            else {
                nums1[i] = nums2[ptr2];
                ptr2--;
            }
            i--;
        }
        while(ptr2 >= 0) {
            nums1[i] = nums2[ptr2];
            ptr2--;
            i--;
        }
        
    }
    
    // public static void main(String[] args) {
//         int[] nums1 = new int[]{1,2,3,0,0,0};
//         new Solution().merge(nums1, 3, new int[]{2,5,6}, 3);
//         System.out.println(new ArrayList<Integer>() {{ for (int i :  nums1) add(i); }});
//     }
}