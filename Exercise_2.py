'''
88 Merge Sorted Array
https://leetcode.com/problems/merge-sorted-array/description/

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

nums1 = [ <-- sorted elements --->, <-- auxiliary space of 0s-->]
nums2 = [ <-- sorted elements --->]

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6]. The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and []. The result of the merge is [1].

Example 3:
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1]. The result of the merge is [1]. Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

Solution:
1. Brute Force:
Copy nums2 to the aux space of nums1. Then sort nums1.
Time: O(N + (M+N) log (M+N)) = O((M+N) log (M+N)), Space: O(1)

2. Three-pointer (aka Two-pointer) approach:
Let A = nums1, B = nums2
Initialize three pointers:
a = points to the last element in the sorted region of array A
b = points to the last element in the sorted region of array B = last element of array B
w = points to the last element of array A (last element in the auxiliary space of A)

Compare the last element of A (indexed by a) vs last element of B (indexed by b).
If A[a] is greater, copy A[w] <-- A[a]. Decrement a and w
If B[b] is greater, copy A[w] <-- B[b]. Decrement b and w
Doing this repeatedly will exhaust the sorted elements of A or B.

If A is exhausted, copy the remaining elements of B, i.e. copy A[w] <-- B[b]. Decrement b and w

If B is exhausted, do nothing because (the remaining elements of A are already in A and sorted)

https://www.youtube.com/watch?v=XJytDszgN14

During initialization, could we set pointers a and b to the first elements of A and B respectively?
Ans: No, because it could potentially lead to two problems:
a) overwriting elements in A
b) unsorted B (after swapping elements with A)
Short discussion: https://youtu.be/XJytDszgN14?t=393  (6:33 - 9:43)

Time: O(M+N), Space: O(1)
'''

def merge_sorted_array(A, B, M, N):
    assert len(A) == M + N, f"Len of array A must be = M+N = {M}+{N} = {M+N}"
    assert len(B) == N, f"Len of array B must be = N = {N}"
    if N == 0:
        return M

    a, b = M-1, N-1
    w = M + N - 1

    while a>=0 and b>=0:
        if B[b] >= A[a]:
            A[w] = B[b]
            b -= 1
        else:
            A[w] = A[a]
            a -=  1
        w -= 1

    # if A empty, copy remaining elements of B to A
    while b>=0:
        A[w] = B[b]
        b -= 1
        w -= 1


def run_merge_sorted_array():
    tests = [([1,2,3,0,0,0], [2,5,6], 3, 3, [1,2,2,3,5,6]), ([1], [], 1, 0, [1]), ([0], [1], 0, 1, [1])]
    for test in tests:
        A, B, M, N, ans = test[0], test[1], test[2], test[3], test[4]
        print(f"\nBefore merge: A = {A}")
        merge_sorted_array(A, B, M, N)
        print(f"After merge: A = {A}")
        print(f"Pass: {ans == A}")

run_merge_sorted_array()
