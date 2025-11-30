# Two-Pointers-2

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
* Brutforce - Hasshmap freq map, keep 2 elements
* Optimal - no extra space used. keep 2 ptrs- i for iterating array, slow ptr for keeping the freq count <=2.


## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
* Brutforce - Copy nums2 arr behind nums1 arr & then sort it - T(n) = O(m+n log(m+n))
* Optimal - 3 pointers p1 for nums1 at m-1, p2 for nums2 at n-1, p3 for num1 at m+n-1.
* comparing p1 & p2 whichever is greater keeping at p3. Look for condition where p2 will still be inbound that time copy elements from p2 to nums1 array at p3.


## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
* Top Right or Bottom Left elements have deciding factor - whether to go up/down or left/right.
* Search the target within limits.
