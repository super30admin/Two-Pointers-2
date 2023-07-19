class Solution:
    def using_extra_space(self, n1, m, n2):
        a=[]
        l=len(n1)
        for i in range(m):
            a.append(n1[i])
        i=0
        j=0
        k=0
        while(i<len(a) and j<len(n2)):
            if(a[i]<=n2[j]):
                n1[k]=a[i]
                i+=1
                k+=1
            else:
                n1[k]=n2[j]
                j+=1
                k+=1
        while(i<len(a)):
            n1[k]=a[i]
            i+=1
            k+=1
        while(j<len(n2)):
            n1[k]=n2[j]
            j+=1
            k+=1

    def no_extra_space(self, n1, m, n2, n):
        i=m-1
        j=n-1
        ind=m+n-1
        while(i>=0 and j>=0):
            if(n2[j]>n1[i]):
                n1[ind]=n2[j]
                j-=1
                ind-=1
            else:
                if(n2[j]<=n1[i]):
                    n1[ind]=n1[i]
                    i-=1
                    ind-=1
        while(j>=0):
            n1[ind]=n2[j]
            j-=1
            ind-=1

    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # self.using_extra_space(nums1, m, nums2)
        self.no_extra_space(nums1, m, nums2, n)
