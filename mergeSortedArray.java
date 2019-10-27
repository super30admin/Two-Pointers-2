/* 88. Merge Sorted Array
Time Complexity: O(m+n)log(m+n)
Space Complexity: O(1)
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}


/*88. Merge Sorted Array
Time Complexity: O(m+n)
Space Complexity: O(1)
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1;
        int p2 = n-1;

        int index = m+n-1;

        while(p2 >= 0 && p1>=0){
            if(nums1[p1] < nums2[p2]){
                nums1[index] = nums2[p2];
                index--;
                p2--;
            }else if(nums1[p1] >= nums2[p2]){
                nums1[index] = nums1[p1];
                index--;
                p1--;
            }
        }

        while(p2>=0){
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }
        // System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}

