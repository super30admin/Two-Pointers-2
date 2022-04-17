using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class Search2DMatrixII
    {
        /*
         * T.C : O(m+n) as we are searching in m and n ways in matrix
         * S.C: O(1) since not using extra space
         */
        public bool SearchMatrixMethod1(int[][] matrix, int target)
        {
            if (matrix == null || matrix.Length == 0)
                return false;

            int row = 0;
            int col = matrix[0].Length - 1;

            //Start with first 0 and last column, since left side is smaller and down side is larger if target is higher decrese row else increase column
            while (row <= matrix.Length - 1 && col >= 0)
            {

                if (matrix[row][col] == target)
                    return true;


                if (matrix[row][col] > target)
                {
                    col--;
                }
                else
                {
                    row++;
                }

            }

            return false;
        }



        public bool SearchMatrixMethod2(int[][] matrix, int target)
        {
            if (matrix == null || matrix.Length == 0)
                return false;

            int row = matrix.Length-1;
            int col = 0;

            while (row >= 0 && col <= matrix[0].Length - 1)
            {
                Console.WriteLine("inside");

                if (matrix[row][col] == target)
                    return true;


                if (matrix[row][col] > target)
                {
                    row--;
                }
                else
                {
                    col++;
                }

            }

            return false;
        }
    }
}
