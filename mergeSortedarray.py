# Time Complexity : O(m)+ O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes   
# 2 pointers at the end of each array and a pointer(ans) at the very end.
# compare at 2 pointers and put larger one at ans if pointer 1 goes out of bounds then add all the array 2 elements to    array 1

def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        ans = m+n-1
        while p2 >=0 and p1>=0:
            if nums1[p1] > nums2[p2]:
                nums1[ans] = nums1[p1]
                p1 -=1
            else:
                nums1[ans] = nums2[p2]
                p2 -=1
            ans -=1
        while p2 >=0:
            nums1[ans] = nums2[p2]
            p2-=1
            ans-=1
        
            
        
        

        
        