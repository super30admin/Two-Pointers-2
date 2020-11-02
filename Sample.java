//Remove Duplicates
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Used two pointers i and j where i will be comparing i and i -1 if they are equal then
//increment count else reset count = 1

// if count is less than or equal to 2 then replace ith value to jth value and increment j 

//at last two duplicates of each element wil be present till jth index, return j
//more than two duplicates element will be after jth index..

// Your code here along with comments explaining your approach
