

def mergeArrays(array1, m, array2, n):

    p1 = m - 1
    p2 = n - 1
    idx = (p + m) - 1 


    while p1 >= 0 and p2 >= 0:

        if array1[p1] > array2[p2]:
            array1[idx] = array1[p1]
            p1 -= 1
            idx -= 1

        else:

            array1[idx] = array2[p2]
            p2 -= 1
            idx -= 1



    while p2 >= 0:
        array1[idx] = array2[p2]
        p2 -= 1
        idx -= 1