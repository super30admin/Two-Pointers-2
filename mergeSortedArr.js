// Time Complexity : O(n)
// Space Complexity : O(1) - constant
// Did this code successfully run on Leetcode : yes

// We utilized 2 pointers to see where values were and compared each of them.
// We also had a check to verify that a pointer wasn’t undefined: pointer1.
// If it was, we would just update the value in the array.

var merge = function (nums1, m, nums2, n) {
  let pointer1 = m - 1;
  let pointer2 = n - 1;

  if (pointer2 < 0) {
    return nums1;
  }

  for (let i = nums1.length - 1; i >= 0; i--) {
    if (nums2[pointer2] >= nums1[pointer1] || nums1[pointer1] === undefined) {
      nums1[i] = nums2[pointer2];
      pointer2--;
    } else {
      nums1[i] = nums1[pointer1];
      pointer1--;
    }
  }
  return nums1;
};
