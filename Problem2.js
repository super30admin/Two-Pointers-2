// ## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

// Did this code successfully run on Leetcode : YES
var merge = function(nums1, m, nums2, n) {
    // Time Complexity : O(N+M)
    // Space Complexity : O(1)
    let p1 = m-1
    let p2 = n-1
    let current = nums1.length-1
    while(p1 >= 0 && p2 >= 0)
    {
        if(nums1[p1]>=nums2[p2]){
            nums1[current] = nums1[p1]
            p1--
        }
        else{
            nums1[current] = nums2[p2]
            p2--
        }
        current--
    }
        while (p2 >= 0) {
            //This will RUN when p1 is pointing to negative as there are no ele in the nums1 array
            //nums1 = [0,0,0]
            //nums2 = [1,2,3]
        nums1[current] = nums2[p2];
        p2--;
        current--;
        }

};
