class Solution:

    def Two_pointer_approach(self, mat, tar):
        top=0
        bottom=len(mat)-1
        low=0
        high=len(mat[0])-1
        i=0
        while(i<len(mat) and high>=0):
            print(i)
            if(tar>mat[i][high]):
                i+=1
            else:
                if(tar==mat[i][high]):
                    return True
                else:
                    high-=1
        return False
        

    def row_search(self, arr, t):
        l=0
        h=len(arr)-1
        while(l<=h):
            mid=l+(h-l)//2
            if(arr[mid]==t):
                return True
            if(arr[mid]<t):
                l=mid+1
            else:
                h=mid-1
        return False
            

    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
           
        return self.Two_pointer_approach(matrix,target)

        # O(nlog(n))
        # element=False
        # for i in matrix:
        #     element=self.row_search(i, target)
        #     if(element==True):
        #         break
        # return element

