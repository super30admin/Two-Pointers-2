#time= O(n)
#space = O(n)

def mergesortedarray(nums1,nums2):
    merged_arr =[]
    i = 0
    j = 0
    m= len(nums1)
    n= len(nums2)

    while i<m and j<n:
        if nums1[i]<nums2[j]:
            merged_arr.append(nums1[i])
            i+=1

        else:
            merged_arr.append(nums2[j])
            j+=1

    print(merged_arr)
    print(i)
    print(j)

    while i<m:
        merged_arr.append(nums1[i])
        i+=1
    while j<n:
        merged_arr.append(nums2[j])
        j+=1
    return merged_arr

nums1 = [1, 3, 5, 7,9,10]
nums2 = [2, 4, 6, 8,66,88]
print(mergesortedarray(nums1, nums2))  # Output: [1, 2, 3, 4, 5, 6, 7, 8]
