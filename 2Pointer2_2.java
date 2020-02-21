//Brute force: 
//Time Complexity: O(n+ nlogn) - using merge sort 
//Space complexity:  O(1)
//leet code: Yes


//merge with the larger arrray and sort

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1, m,n);
        Arrays.sort(nums1);
    }
}