
#Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Your code here along with comments explaining your approach rain a two pointer approach iterating through the array, if the counter goes above two its not add to the array

    def removeDuplicates(self, nums: List[int]) -> int:

        count = 1 
        j = 1
        i=1
        while i < len(nums):
            if nums[i] == nums[i-1]:
                count += 1
                if count > 2:
                    i +=1
                    continue
            else:
                count = 1
            nums[j] = nums[i]
            i+=1
            j+=1

        return j

#Time Complexity : O(N)
# Space Complexity : 0(1)
# Did this code successfully run on Leetcode : Yes 
# Three line explanation of solution in plain english
# Your code here along with comments explaining your approach

def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        idx = m+n - 1

        while idx >= 0:
            
            num1 = nums1[p1] if p1>=0 else float('-inf')
            num2 = nums2[p2] if p2>=0 else float('-inf')

            if num1 > num2:
                nums1[idx] = num1
                p1-=1
            else:
                nums1[idx] = num2
                p2-=1
            idx-=1
        return nums1


#Time Complexity : 0(M+N)
# Space Complexity : 0(1)
# Did this code successfully run on Leetcode : Yes

# start from top right corner and go down if the target is bigger than current and go left otherise go one row down 

def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        row = 0 
        col = len(matrix[0]) - 1

        while( row < len(matrix) and col >= 0):

            if matrix[row][col] == target:
                return True 
            elif matrix[row][col] < target:
                row+=1

            else:
                col-=1
        return False 
        
        