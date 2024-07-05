#########88. Merge Sorted Array############################################################################################################################
// Time Complexity : n
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I was taking the pointers in beginning but it was messing up my list when trying to append than post class understood that pointer should be taken from last to maintain order

// Your code here along with comments explaining your approach in three sentences only
We had 3 pointers p1 at the end of list1 element p2 at end of list1 itself and p3 at end of list 2, now we compare p1 and p3 and which ever is largest we place it in p2 and move the pointers and list will be sorted


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1=m-1
        p2=n-1
        r=len(nums1)-1
        while p1>=0 and p2>=0:
            if nums1[p1]>=nums2[p2]:
                nums1[r]=nums1[p1]
                p1-=1
            else:
                nums1[r]=nums2[p2]
                p2-=1
            r-=1
        while p1>=0:
            nums1[r]=nums1[p1]
            p1-=1
            r-=1
        while p2>=0:
            nums1[r]=nums2[p2]
            p2-=1
            r-=1


        

        

########80. Remove Duplicates from Sorted Array II########################################################################################################################


// Time Complexity : n
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I was not able to crack the problem, but after class tried it myself

// Your code here along with comments explaining your approach in three sentences only
We have fast and slow pointer, the fast pointer is to iterate and slow pointer is to collect

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        cnt=[0,0,0]
        for i in nums:	@ new list with count
            cnt[i]+=1
        #print(cnt)
        k=0
        for i,val in enumerate(cnt):#02,12,22		#traverse through list and populated as per each count
            for j in range(val):#2,2,2
                nums[k]=i
                k+=1

        

        


########240. Search a 2D Matrix II######################################################################################################


// Time Complexity : class solution - m+n, my solution - blogs
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I figured out using for loops to select the cell where element may be present and than applied BS but in class a better approach with TC m+n was taught


// Your code here along with comments explaining your approach in three sentences only
#in my way I ran for loop to identify the column where records are present and than on those columns I ran BS
# in class it was taught to start at 1 corner where on 1 side value is increasing and other side value is decreasing and keep traversing till we find the element


##############class solution

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows=len(matrix)
        cols=len(matrix[0])
        r,c=0,cols-1
        while (r>=0 and r<=rows-1) and (c>=0 and c<=cols-1):
            if target < matrix[r][c]:
                c-=1
            elif target > matrix[r][c]:
                r+=1
            else:
                return True
        return False


############### my solution
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows=len(matrix)
        cols=len(matrix[0])
        for i in range(rows):
            if target>=matrix[i][0] and target<=matrix[i][-1]:
                pos=self.BS(matrix[i],cols,target)
                if pos==1:
                    return True
        return False

    def BS(self,arr,cols,target):
        l,r=0,cols-1
        while l<=r:
            mid=(l+r)//2
            if target<arr[mid]:
                r=r-1
            elif target>arr[mid]:
                l=l+1
            elif target==arr[mid]:
                return 1
            else:
                return 0
        


        
        
        
        




  