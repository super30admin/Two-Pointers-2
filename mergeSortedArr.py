class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
    
        pointerA = m-1
        pointerB = n-1
        counter = len(nums1)-1
        
        print(m, n, len(nums1), len(nums2))
        
        while pointerB>=0 and pointerA>=0:
            
            if nums1[pointerA] > nums2[pointerB]:
                nums1[counter] = nums1[pointerA]
                pointerA-=1
            
            else:
                nums1[counter] = nums2[pointerB]
                pointerB-=1
        
            
            counter -= 1 

        while pointerA>=0:
            nums1[counter] = nums1[pointerA]
            counter -= 1
            pointerA -=1
            
        while pointerB>=0:
            nums1[counter] = nums2[pointerB]
            counter -= 1
            pointerB -=1
            
#  time complexity is O(m+n)
#  doubt in this problem -- why are we only checking remaining elements in the secondary array, I have added both conditions, but it would work without checking in primary array at end of first while loop.
#  Approach is to have a pointerA in primary and pointer B in secondary array, have a counter pointer at the end of primary array and add max(value at pointerA,B) at counter and reduce counter and the bigger value pointer. 
