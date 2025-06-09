# Two-Pointers-2

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

# Initialize a slow pointer starting with the first index and a count varaible to track repeats
# Run a for loop and check if the first element value is equal to second element value, if so we 
# increase the count else we reset the count to '1'
# In case the count is less than 2 (meaning element is repeating twice) we swap the element with the 
# position of the slow pointer and increment it.
# Return the original array.

## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

# Initialize two pointers starting with the last element of the arrays from the given sizes and an 
# index pointer starting with the total size of both the arrays.
# While both pointers are greater than '0', check if the value of first pointer element is greater than
# the second pointer element and swap with the index pointer position. Decrement the first pointer.
# Else we will swap the second pointer element with the index pointer position.
# In case of varying sizes if the first array finishes then we copy the elements of the second array 
# and replace the values directly using the index pointer.

## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

# Two Pointers
# We search for the element either from the Top right element OR the Bottom left element of the matrix
# Iterate starting from top right element until the column is not out of bounds and row is greater than
# zero
# If the current element is the target we return TRUE else if it is less than the target move to the 
# next row eliminating the row elements else decrement the column
# The element is not found return FALSE

