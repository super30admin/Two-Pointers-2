// ## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

const merge = function(nums1, m, nums2, n) {
    if(n === 0) return;
    let i = nums1.length - 1, p2 = n - 1, p1 = m - 1;   
    while(p1 >= 0 && p2 >= 0) {
        if(nums1[p1] > nums2[p2]) {
            nums1[i] = nums1[p1];
            p1--;
        }
        else { // nums2[p2] >= nums1[p1])
            nums1[i] = nums2[p2]
            p2--;
        }
        i--;
    }
    while(p2 >= 0) {
        nums1[i] = nums2[p2];
        p2--;
        i--;
    }
    return nums1;
};