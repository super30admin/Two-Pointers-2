P1) Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
// Time Complexity :  O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We keep two pointers one to augment the array and other one
// to find the right value. The right value should skip values 
// after count goes more than 2. if count<=2 we copy value from the
// ahead pointer to lagging pointer.

P2) Problem2 (https://leetcode.com/problems/merge-sorted-array/)
// Time Complexity :  O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// it is like merging operation in merge sort but we do it 
// from last largest values of both the arrays and keep another pointer at the end 
// of nums1 to fill it up. 
// Your code here along with comments explaining your approach

P3) Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
// Time Complexity :  O(M+N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// start from any corner which lies on NE-NW direction  why? because both the column and 
// row have different order allowing you to chose one of them while traversing.
// this way you can use the sorting order of both rows and column 
