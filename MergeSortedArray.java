class Solution {
	//Time Complexity: O(m+n)
	//Space Complexity: O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int p1 = m-1, p2 = n-1, np =m+n-1;

       while (p1 >=0  && p2 >=0){
        if (nums1[p1] > nums2[p2]){
            nums1[np] = nums1[p1];
            np--; p1--;
        } else {
             nums1[np] = nums2[p2];
            np--; p2--;
        }
       }
        if (p2 >= 0){
        while (p2 >=0 ){
            nums1[np] = nums2[p2];
            np--;p2--;
        }
       }
    }
}
