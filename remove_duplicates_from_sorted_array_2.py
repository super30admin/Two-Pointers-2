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
Maintain a left and right pointer. Use the right pointer for reading the array and keeping frequency count of repeated elements. Use the left pointer for writing the repeated elements into the array up to min(freq count, K) times.
K = max no. duplicates allowed
Time: O(N), Space: O(1)
https://youtu.be/zIOGLbAFBOM?t=1393
'''
import copy

def remove_duplicates_from_sorted1(nums, K):
    '''
    K = max no. of duplicates allowed
    Two pointer approach: For each increment of fast pointer, read the value of the array at fast pointer, maintain a freq count of that value. Write that value into nums[slow], i.e. nums[slow] = nums[fast]. Increment slow pointer by 1 step.
    The writing part into slow pointer is allowed only if count <= K.
    '''
    N = len(nums)
    if N == 0:
        return -1
    elif N == 1:
            return 1
    slow = 1
    count = 1
    for fast in range(1, N):
        if nums[fast] == nums[fast-1]:
            count += 1
        else:
            count = 1

        if count <= K:
            nums[slow] = nums[fast]
            slow += 1
    return slow

def remove_duplicates_from_sorted2(nums, K):
    '''
    K = max no. of duplicates allowed
    Two pointer: Slightly different code structure
    where we increment fast pointer until we hit the next
    unique element and then write at the index pointed to by
    slow pointer.
    '''
    N = len(nums)
    if N == 0:
        return -1
    elif N == 1:
        return 1
    slow = 0
    count = 1
    for fast in range(1, N):
        if nums[fast] == nums[fast-1]:
            count += 1
        else:
            n = 1
            while n <= min(count, K):
                nums[slow] = nums[fast-1]
                slow += 1
                n += 1
            count = 1

    # copy the final repeated element of the sequence
    n = 1
    while slow <= fast and n <= min(count, K):
        nums[slow] = nums[fast]
        slow += 1
        n += 1
    return slow # there are 'slow' no. of elements from index=0...slow-1


def run_tests():
    tests = [([1,1,1,2,2,3], 2, [1,1,2,2,3]),
             ([1,1,1,2,2,3], 1, [1,2,3]),
             ([1,2], 2, [1,2]),
             ([1,2], 1, [1,2]),
             ([0,1,1,2,2,3,3,3,3,3], 2, [0,1,1,2,2,3,3]),
             ([0,1,1,2,2,3,3,3,3,3], 3, [0,1,1,2,2,3,3,3]),
             ([0,1,1,1,1,1,2,2,3,3,3,3,3], 2, [0,1,1,2,2,3,3]),
             ([0,1,1,1,1,1,2,3,3,3,3,3], 2, [0,1,1,2,3,3]),
             ([0,1,3,3,3,3,3], 2, [0,1,3,3]),
             ([1,1,1,1,1,3], 2, [1,1,3]),
             ([1,3,3,3,3], 2, [1,3,3]),
             ([1,1,1,1,1], 2, [1,1]),
             ([1], 2, [1])
    ]

    for test in tests:
        nums, K, ans = test[0], test[1], test[2]
        nums1 = nums.copy()
        nums2 = nums.copy()
        print(f"\nBefore remove duplicates = {nums}")
        print(f"Max no. of duplicates allowed = {K}")
        index1 = remove_duplicates_from_sorted1(nums1, K)
        index2 = remove_duplicates_from_sorted2(nums2, K)
        print(f"1. Num elements = {index1}, nums = {nums1[:index1]}")
        print(f"2. Num elements = {index2}, nums = {nums2[:index2]}")
        passed = (ans == nums1[:index1] == nums2[:index2])
        assert passed == True, f"Test case failed"
        print(f"Pass: {passed}")

    print(f"\nDONE")

run_tests()