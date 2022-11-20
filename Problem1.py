#Time Complexity: O(n)
#Space Complexity: O(1)

#Accepted on Leetcode

#Approach:
#Use two pointers, i to iterate and j to keep track of number of duplicates > 2. Keep a track of current number and it's count (number of duplicates)
#At each iteration, increment i by 1 (and also not current number count). Do not increment j if current number count > 2
#Keep doing A[i] = A[j] so that numbers move forward and overwrite the duplicates (remember that j does not move if curNumberCount > 2 so all duplicates more than 2 in count will be overwritten)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        A = nums
        i = j = 1
        count = 1
        while i < len(A):
            if A[i] != A[i-1]:
                count = 1
            else:
                count += 1

            A[j] = A[i]

            if count <= 2:
                j += 1
            i+= 1

        return j




