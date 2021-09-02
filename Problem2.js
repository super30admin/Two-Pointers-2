// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
//I have taken 3 pointers- 2pointers starting from m-1 and n-1, one pointer pointing to the last element
// where tthe array needs to be inserted
//Willcompare values at ptr1 & ptr2 and insert at ptr3 on whichever is greater and decrement the pointer val of the particular elem chosen

var merge = function (nums1, m, nums2, n) {
    let ptr1 = m - 1, ptr2 = n - 1;
    let i = m + n - 1;
    while (ptr1 >= 0 && ptr2 >= 0) {
        if (nums2[ptr2] > nums1[ptr1]) {
            nums1[i] = nums2[ptr2];
            ptr2--;
        } else {
            nums1[i] = nums1[ptr1];
            ptr1--;
        }
        i--;
    }
    while (ptr2 >= 0) {
        nums1[i] = nums2[ptr2];
        ptr2--;
        i--;
    }

};
