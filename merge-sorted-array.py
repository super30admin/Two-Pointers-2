# tc O(n), sc O(1).
i, j = m-1, n-1
k = m+n-1

while k >= 0:
    n1 = nums1[i] if i >= 0 else float('-inf')
    n2 = nums2[j] if j >= 0 else float('-inf')

    if n1 >= n2:
        nums1[k] = n1
        i -= 1
    else:
        nums1[k] = n2
        j -= 1
    k -= 1