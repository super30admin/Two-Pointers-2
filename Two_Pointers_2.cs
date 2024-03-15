using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace S30_Problems
{
    class Program
    {
        static void Main(string[] args)
        {
            Program p = new Program();
            p.Merge(new int[] { 0 }, 0, new int[] { 1 }, 1);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        public int RemoveDuplicates(int[] nums)
        {
            int write = 0, count = 0;
            for (int read = 0; read < nums.Length; read++)
            {
                if (read == 0 || nums[read] != nums[read - 1]) count = 1;
                else count++;
                if (count <= 2)
                {
                    nums[write] = nums[read];
                    write++;
                }
            }
            return write;
        }

        // Time Complexity: 2 * O(log(n!)) i.e. 2 * (O(log(n) && log(n-1) && log(n-2)...))
        // Space Complexity: O(1)
        int[][] matrix;
        int target;
        public bool SearchMatrix(int[][] matrix, int target)
        {
            if (matrix == null || matrix.Length == 0) return false;
            this.matrix = matrix;
            this.target = target;
            return SearchMatrixHelper(0, matrix[0].Length - 1, 0, matrix.Length - 1);
        }

        public bool SearchMatrixHelper(int left, int right, int up, int down)
        {
            if (left > right || up > down) return false;
            int mid = left + (right - left) / 2;
            int row = up;
            while (row <= down && matrix[row][mid] <= target)
            {
                if (matrix[row][mid] == target) return true;
                row++;
            }
            return SearchMatrixHelper(left, mid - 1, row, down) ||
                SearchMatrixHelper(mid + 1, right, up, row - 1);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        public void Merge(int[] nums1, int m, int[] nums2, int n)
        {
            int i;
            for (i = nums1.Length - 1; i >= 0 && m > 0 && n > 0; i--)
            {
                if (nums1[m - 1] > nums2[n - 1])
                {
                    nums1[i] = nums1[m - 1];
                    m--;
                }
                else
                {
                    nums1[i] = nums2[n - 1];
                    n--;
                }
            }
            while (n > 0)
            {
                nums1[i] = nums2[n - 1];
                i--;
                n--;
            }
        }
    }
}
