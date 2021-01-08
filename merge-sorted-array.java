// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : 
// since nums1 is m+n length, add max of element from nums1 and num2 starting from last elements and keep decrementing

// Your code here along with comments explaining your approach


public void merge(int[] nums1, int m, int[] nums2, int n) {
    int j1 = m-1;
    int j2 = n-1;
    for(int i = m+n-1; i >=0; i--){
        if(j2<0){
            nums1[i] = nums1[j1--];
        } else if(j1<0){
            nums1[i] = nums2[j2--];
        } else if(nums1[j1]>nums2[j2]){
            nums1[i] = nums1[j1--];
        } else {
            nums1[i] = nums2[j2--];
        }
    }
}