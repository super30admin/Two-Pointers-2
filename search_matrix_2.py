class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:


        for list1 in matrix:

            if list1[0]<=target and list1[-1]>=target:
                left = 0
                right = len(list1)
                while left<=right:
                    mid = (left+right)//2
                    
                    if list1[mid]==target:
                        return True
                    elif target<list1[mid]:
                        right=mid-1
                    else:
                        left=mid+1

                # if target in list1:
                #     return True
        return False
