'''
tc:O(N)
sc:O(1)
'''
class Solution:
    def sort(self,array1,array2,m,n):
        if not array1 and array2:
            return []
        i =m+n-1
        p1 = m-1
        p2 = n-1

        while p1>= 0 and p2 >=0:
            if array1[p1] > array2[p2]:
                array1[i] = array1[p1]
                p1-=1
            else:
                array1[i] = array2[p2]
                p2-=1
            i-=1
        
        while p2>=0:
            array1[i] = array2[p2]
            p2-=1
            i-=1

array1 = [1,2,3,0,0,0]
array2 = [2,5,6]
print(Solution().sort(array1,array2,3,3))
print(array1)