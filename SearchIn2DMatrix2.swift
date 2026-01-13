//
//  SearchInMatrix2.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 1/12/26.
//

/*
 Multiple approaches
 BruteForce -> linear traversal in row and column - O(mn), no extra space
 approach 1 - binary search on each row
 m log n -> in each row, check the range, If the element lies in range 1 - 15 then do binary search. If not, then go to the next row.
 n log m -> In each column, check the range and see if element can lie in that. Then do binary search on the column. If no of columns are smaller then this one is better.
 m + n -> Using steps -> can start from top right element. In column from 0 to end, the numbers are increasing. In row, from end to 0, the numbers are decreasing
 If I start from 0,0 and element is 6 then I can go towards row side and towards colmns side also, thats why we can choose top right corner and bottom left corner. Because we will have proper choices.
 we calculate time complexity using worst case. m - 1 million, n also 1 million. always think array as 1 million * 1 million.
 */

class SearchInTwoDMatrix {
    
    init() {
        let isPresent = searchInTwoDMatrix(matrix: [[1,4,7,11,15], [2,5,8,12,19], [3,6,9,16,22], [10,13,14,17,24], [18,21, 23, 26, 30]], target: 14)
        print("isPresent \(isPresent)")
    }
    
    func searchInTwoDMatrix(matrix: [[Int]], target: Int) -> Bool {
        let m = matrix.count
        let n = matrix[0].count
        
        var i = 0
        var j = n - 1
        //from top right corner
        while (i < m && j >= 0) {
            //i++, j--
            if (matrix[i][j] == target) {
                return true
            } else if (matrix[i][j] > target) {
                j -= 1
            } else {
                i += 1
            }
        }
        return false
    }
    
    func searchInTwoDMatrixFromBottomLeftCorner(matrix: [[Int]], target: Int) -> Bool {
        let m = matrix.count
        let n = matrix[0].count
        
        var i = m - 1
        var j = 0
        //from top right corner
        while (j < n && i >= 0) {
            //i++, j--
            if (matrix[i][j] == target) {
                return true
            } else if (matrix[i][j] > target) {
                i -= 1
            } else {
                j += 1
            }
        }
        return false
    }
    
}
