//Time complexity = o(m + n)
// Space complexity = o(1)

function searchMatrix(matrix: number[][], target: number): boolean {
    const maxRow = matrix.length
    const maxColumn = matrix[0].length

    let r = 0
    let c = maxColumn - 1
    while(r >= 0 && r < maxRow
            && c >= 0 && c < maxColumn){
                if(matrix[r][c] === target)  {return true}
                else if(matrix[r][c] < target) { r++}
                else { c--}
            }
    return false
};
