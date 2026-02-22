#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Feb 22 14:11:49 2026

@author: rishigoswamy

    LeetCode 240: Search a 2D Matrix II
    Link: https://leetcode.com/problems/search-a-2d-matrix-ii/

    Approach:
    Start from bottom-left (or top-right).

    Matrix properties:
        - Each row is sorted left → right.
        - Each column is sorted top → bottom.

    Strategy:
        Start at bottom-left:
            row = m - 1
            col = 0

        If current value < target:
            move right (col++)
        If current value > target:
            move up (row--)
        If equal:
            return True

    Why this works:
        From bottom-left:
            - Moving right increases values.
            - Moving up decreases values.
        So we eliminate one row or one column every step.

    // Time Complexity : O(m + n)
        At most m upward moves and n rightward moves.
    // Space Complexity : O(1)
        Constant extra space.
"""

from typing import List

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rowLimit = len(matrix)
        columnLimit = len(matrix[0])
        row = len(matrix)-1
        col = 0
        if target > matrix[-1][-1]:
            return False
        while row >= 0 and col < len(matrix[0]):
            if matrix[row][col] == target:
                return True
            if matrix[row][col] < target:
                col+=1
            else:
                row-=1
            
        


