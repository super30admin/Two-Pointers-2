/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let i = m -1, j = n -1, k = m+n-1;

    while(j >= 0){
        console.log(nums1[i])
        console.log(nums2[j])
        console.log(nums1[k])
        if (i>=0 && nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            k--;
            i--;
        }
        else {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}