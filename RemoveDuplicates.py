"""
Rasika Sasturkar
Time Complexity: O(n)
Space Complexity: O(1)
"""


def removeDuplicates(nums) -> int:
    """
    We take 2 pointers (fast & slow) and run the entire loop on fast pointer.
    Slow pointer is used to overwrite the values (no swapping required).
    """
    # null case
    if nums is None:
        return 0

    count = 1
    slow = 1

    for fast in range(1, len(nums)):
        if nums[fast] == nums[fast - 1]:
            count += 1
        else:
            count = 1
        if count <= 2:  # can make this generic with "k"
            nums[slow] = nums[fast]
            slow += 1

    return slow


def main():
    """
    Main function - examples from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    print(removeDuplicates(nums=[1, 1, 1, 2, 2, 3]))  # return 5
    print(removeDuplicates(nums=[0, 0, 1, 1, 1, 1, 2, 3, 3]))  # return 7


if __name__ == "__main__":
    main()
