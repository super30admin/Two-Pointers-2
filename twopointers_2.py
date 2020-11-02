#remove duplicates
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i=j=1
        count=1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                count=count+1
            else:
                count=1
            if count<=2:
                nums[j]=nums[i]
                j=j+1
        return j
		
		


#Merge sorted array	
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        
        p1=m-1
        p2=n-1
        i=m+n-1
        
        while(p1>=0 and p2>=0):
            if nums1[p1]>nums2[p2]:
                nums1[i]=nums1[p1]
                p1=p1-1
            else:
                nums1[i]=nums2[p2]
                p2=p2-1
            i=i-1
        while p2>=0:
            nums1[i]=nums2[p2]
            p2=p2-1
            i=i-1
        
        return nums1
		
		
#Search in a 2D matrix	
class Solution:
    def searchMatrix(self, matrix, target):
        m=len(matrix)
        
        if m==0: return False
        
        n=len(matrix[0])
        
        i=0
        j=n-1
        
        while (i<m and j>=0):
            
            if matrix[i][j]==target:
                return True
            else:
                if matrix[i][j]<target:
                    i=i+1
                else:
                    j=j-1
        return False
        