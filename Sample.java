//PROBLEM 01
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :no
// Three line explanation of solution in plain english
// 1. Iterate through the array while keeping track of duplicates using a flag.  
// 2. If an element appears for the first or second time, keep it; otherwise, skip it.  
// 3. Modify the array in place and return the new valid length. 


//PROBLEM 02
// Time Complexity :o(m+n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :no
// Three line explanation of solution in plain english
// 1. Start from the end of both arrays and compare elements, placing the larger one at the last available position in `nums1`.  
// 2. Continue moving backward until one array is fully processed.  
// 3. If any elements remain in `nums2`, copy them directly into `nums1`. 


//PROBLEM 03
// Time Complexity :o(m+n)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode :no
// Three line explanation of solution in plain english
// 1. Start from the **top-right** corner of the matrix and compare the value with the target.  
// 2. If the value is **greater** than the target, move **left**; if it's **smaller**, move **down**.  
// 3. Continue until the target is found (return `true`) or you go out of bounds (return `false`). 