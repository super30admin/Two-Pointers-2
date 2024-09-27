# June 11, 2020
# Referred leetcode for 3rd best approach

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # Method 3 : pointer m and n at the end of array : Hint array is sorted
        # Time complexity : O(n+m) where n and m are lengths of two arays
        # Space complexity : O(1)
        # No temp array
        '''
        - arrived at this solution after other two approaches
        - The intuition mainly comes from approach 2, one pass and doing it in O(1) space
        - Avoiding a temp array allows to think how it can be done using two pointers
        - Array being sorted helps

        '''

        # works in leetcode

        while n > 0:
            if m == 0 or nums2[n - 1] >= nums1[m - 1]:  # put greater digits at the end
                nums1[m + n - 1] = nums2[n - 1]
                print('if', nums1, m)
                n -= 1  # since we are picking nums[n-1], we are shifting pointer to right
            else:
                nums1[m + n - 1] = nums1[m - 1]
                print('hey', nums1, m)
                m -= 1

        '''# For understanding Method 3 ( niceee 1)

        count = 0
        while n > 0:
            if m <= 0 or nums2[n-1] >= nums1[m-1]:  
                nums1[m+n-1] = nums2[n-1]
                count+=1
                print(count,nums1,'nums1')
                n -= 1
            else:
                print('m=',m, 'n=', n)
                nums1[m+n-1] = nums1[m-1]
                count+=1
                print(count,nums1,'else')
                m -= 1
        '''

        # Method 2: two pointers, this makes use of sorted arrays
        # Time complexity : O(n+m) where n and m are lengths of two arays
        # Space complexity : O(m)
        # As we make a temp array of len(m)

        '''
        temp_nums1 = nums1[:m] # index 0 1 2 # copy made
        print(temp_nums1) # [1,2,4]

        # empty nums1
        nums1[:] = []

        p1 = 0
        p2 = 0

        while p1 < m and p2 < n:
            if temp_nums1[p1]<=nums2[p2]:
                nums1.append(temp_nums1[p1])
                p1+=1
            else:
                nums1.append(nums2[p2])
                p2+=1
        print(nums1)
        print(p1,p2)

        # print remaining elements, from end of nums1, hence len(nums1) is the index to start with
        if p1 < m :
            nums1[len(nums1):] = temp_nums1[p1:]
        elif p2 < n:
            nums1[len(nums1):] = nums2[p2:]

        '''

        # Method 1 :
        # Time complexity : selection sort (O(n+m)*log(n+m))
        # Space complexity : O(1)
        ''' 
        # does not use that arrays are sorted

        j=0

        for i in range(m,len(nums1)): # start at index 3
            nums1[i] = nums2[j]
            j+=1
            print(nums1)

        for i in range(len(nums1)):
            min_index = i # start of array initially, then proceed further

            for j in range(i+1,len(nums1)):

                if nums1[j]<nums1[min_index]:
                    min_index = j

            temp = nums1[min_index]
            nums1[min_index] = nums1[i]
            nums1[i] = temp
            print(nums1)
        return nums1

        '''
































