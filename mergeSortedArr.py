class Solution:

    def mergeSortedArr(self, nums1, nums2, m, n):

        p1 = m - 1
        p2 = n - 1
        p3 = (m + n) - 1

        while p1 >= 0 and p2 >= 0:

           if(nums1[p1] > nums2[p2]): 
               nums1[p3] = nums1[p1]
               p1-=1
           
           elif (nums1[p1] < nums2[p2]):
               nums1[p3] = nums2[p2]
               p2-=1

           p3-=1


        while p2 >= 0:
            nums1[p3] = nums2[p2]
            p3-=1
            p2-=1

        print("Function check")
        return nums1

nums1 = [1, 2, 3, 0, 0, 0];
nums2 = [2, 5, 6];
m = 3;
n= 3;
result = Solution()
output = result.mergeSortedArr(nums1, nums2, m, n); 
print(output)

