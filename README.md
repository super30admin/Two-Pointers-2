# Two-Pointers-2

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
Approach:
1. Here the problem suggests that we can keep at most 2 occurances of each number. Hence I start my for loop from 2 and put a pointer of left and right. left = 2 and right = 2.
2. Check if arr[left-2] != arr[right], if its not equal, then replace arr[left] with arr[right] and left++, else just do right++.
3. for example 0,0,0,1,1,2,2. Initially my left and right would be at third 0, in the first loop, I'll check whether they are equal or not. if equal just increment right pointer. Now my right is at 1 and left at third 0, they are not equal so i.e. third 0 is not equal to 1 then replace left with right. Continue this process till the end.


## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
Approach:
1. Here we take 3 pointers, i at end of the of the numbers of first(big) array, count at literally end and j at the end of the 2nd array.
2. Compare my i with j, if j is greater then replace my count number with j and do j--, count--, else replace my i with count and do i-- and count--.
3. for corner cases, check if my j is greater than 0, that means we are still remaining with some numbers in j, so replace j with count and do j-- and count-- till j becomes 0.
4. Continue this process till the end


## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
Approach:
1. Here both rows and columns are sorted, so put i at 0 and j at matrix[0].length-1.
2. if my matrix[row][column]>target then it means that particular column does not contain the target since column values are sorted. Hence do column--.
3. If my matrix[row][column]<target then it means that particular row does not contain the target since row is also sorted hence do row++.
4. When target is found return true else return false.

