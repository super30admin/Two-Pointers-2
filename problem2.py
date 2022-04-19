#Merge sorted array

# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this :no



def merge( nums1, m, nums2, n):
    r1=m-1
    r2=n-1
    r3=m+n-1
    while r2>=0:                #keep going until you finish nums2
        if r1<0 or nums2[r2]>nums1[r1]:             #if r1 is finished or r2 is bigger than r1 then add r2 to the last of nums1
            nums1[r3]=nums2[r2]
            r2-=1
        else:
            nums1[r3]=nums1[r1]                     #else add r1 to the last of nums1
            r1-=1
        r3-=1
    print(nums1)

#testing
print(merge([1,2,3,0,0,0],
3,
[2,5,6],
3))