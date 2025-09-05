 # Tc:O(m+n)  SC:O(1)
def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
    m=len(matrix)
    n=len(matrix[0])
    r=m-1
    c=0
    while r>=0 and c<=n-1:
        if matrix[r][c]==target:
            return True
        if matrix[r][c]<target:
            c+=1
        else:
            r-=1
    return False
        