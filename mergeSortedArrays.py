# // Time Complexity : O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

## we basically need to merge the arrays in place. We take 2 pointers , one starting at the end of nums1 and 
## and the other starting from end of nums2. we start our idx from end of the bigger array and compare the other
## 2 pointers , which ever is bigger we put that value at our idx and move idx and that pointer. in the end
## we check if p2 >= 0 if so we contiune doing the process. we dont need to check for p1 as it is already sorted

# // Your code here along with comments explaining your approach

class solution:
    def merge(self, nums1, nums2, m, n):

        p1 = m-1
        p2 = n-1
        idx = m+n-1
        while (p1>= 0 and p2>= 0):

            if nums1[p1] > nums2[p2]:
                nums1[idx] = nums1[p1]
                idx-=1
                p1-=1
            
            else:
                nums1[idx] = nums2[p2]
                p2-=1
                idx-=1
        
        while p2>=0:
            nums1[idx] = nums2[p2]
            idx-=1
            p2-=1
        

        

