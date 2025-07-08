'''
80 Remove duplicates from sorted array II
https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}

If all assertions pass, then your solution will be accepted.

Example 1:
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:
Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Constraints:
1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.

Solution:
1. Brute Force (w/o bothering about constraints):
Traverse the array, maintain a hash map of freq count of each element.
Then populate the same array where each element is repeated not more than twice.
Time: O(N), Space: O(N)

2. Two-pointer:
Maintain a left and right pointer. Use the right pointer for reading the array and keeping frequency count of repeated elements. Use the left pointer for writing the repeated elements into the array up to min(freq count, 2) times.
Time: O(N), Space: O(1)
'''
def remove_duplicates_from_sorted2(A):
    N = len(A)
    if N == 0:
        return -1
    i, j = 0, 1
    count = 1
    while j < N:
        # current = prev -> keep counting, no copy
        if A[j] == A[j-1]:
            count += 1
        else: # current != prev, copy repeating element at most twice
            # Here, j-1 points to the last index of repeated element
            n = 0
            while i<j and n < min(count, 2):
                A[i] = A[j-1]
                i += 1
                n += 1
            count = 1
        j += 1

    # copy the final repeated element of the sequence
    n = 0
    while i<j and n < min(count, 2):
        A[i] = A[j-1]
        i += 1
        n += 1
    return i


def run_remove_duplicates_from_sorted2():
    tests = [([1,1,1,2,2,3], [1,1,2,2,3]),
             ([0,1,1,2,2,3,3,3,3,3], [0,1,1,2,2,3,3]),
             ([0,1,1,1,1,1,2,2,3,3,3,3,3], [0,1,1,2,2,3,3]),
             ([0,1,1,1,1,1,2,3,3,3,3,3], [0,1,1,2,3,3]),
             ([0,1,3,3,3,3,3], [0,1,3,3]),
             ([1,1,1,1,1,3], [1,1,3]),
             ([1,3,3,3,3], [1,3,3]),
             ([1,1,1,1,1], [1,1]),
             ([1], [1])]

    for test in tests:
        A, ans = test[0], test[1]
        print(f"\nBefore remove duplicates = {A}")
        index = remove_duplicates_from_sorted2(A)
        print(f"After remove duplicates = {A[:index]}")
        print(f"Pass: {ans == A[:index]}")

run_remove_duplicates_from_sorted2()