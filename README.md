# Two-Pointers-2

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

Here we know that array is sorted. So, we will keep slow pointer at 0th index and our fast pointer will start from 1st index and we will maintain a count which is initialized to 1 for 1st element. Now, we will check if the current element is same as previous element, if it is we will increase count by 1 or if it is not same that means it is a first occurance of new element so we will set counter to 1. Then we will check if the count is less than or equal to 2 if it is then we will increase slow pointer by 1 and we will replace that element with current element. At the end we will return slow+1 as we are accounting for last element for which we did not increase slow pointer.



## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

The main idea here is nums1 array has enough length to accomodate both nums1 and nums2 so we will start filling it up from last element. So, we will keep 2 pointers p1 and p2 at the end of nums1 and nums2 arrays respectively. Then we will check which element is bigger betweeen these 2 and will fill that element in last index of nums1 array. If we fill it from nums1 then we will decrease p1 pointer if we do it from num2 then we will decrease p2 pointer. In any case we will decrease the index of nums1 array from last element as we will be definitely filling it. If we are done with nums2 and p1 pointer of num1 is still at some mid index it's fine we don't need to accomodate that. But if we are done with nums1 array and our p2 pointer is somewhere in the nums2 array then we will fill all remaining elements from nums2 to nums1 one by one.



## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

The main idea here is check which side of the matrix shows constant increasing pattern. So, we will start from 0th row and last column as last column shows increasing pattern from top to bottom and row shows decreasing pattern from right to left. Here simple logic is if the current element is target we will return true otherwise we will check if the target is greater than current element if it is then we can go to next row eliminating this row as the current shows decreasing pattern in the left. If target is less than the current element we will go to the left element of the row by decreasing column index as row shows decreasing pattern from right to left. If we do not find an element we will return false.