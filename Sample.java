
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//TIME COMPLEXITY:O(N)
//SPACE COMPLEXITY:O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        

        int col = matrix[0].length-1;
        int row = 0;


        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else if (target > matrix[row][col]) {
                row++;
            }
        }
        return false;

    }
}


// merge sorted array
//TIME COMPLEXITY:O(M+M)
//SPACE COMPLEXITY:O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p3 = m+n-1;
        int p2= nums2.length-1;
        int p1= m-1;


        if (m ==0){
            while (p2>=0) {
                nums1[p3] = nums2[p2];
                p2--;
                p3--;
            }

        }
        while(p2>=0 && p1 >=0) {
            if (nums2[p2] > nums1[p1]) {
                nums1[p3] = nums2[p2];
                p3--;
                p2--;
            } else if(nums1[p1] > nums2[p2]) {
                nums1[p3] = nums1[p1];
                p3--;
                p1--;
                System.out.println(p3);
            } else{
                nums1[p3] = nums2[p2];
                p2--;
                p3--;
            }
        }

        while (p2>=0) {
            System.out.println(p3);
            System.out.println(p3);
            nums1[p3] = nums2[p2];
            p3--;
            p2--;
        }
    }
}


// remove duplicates
// SPACE COMPLEXITY:O(1)
// TC:O(N)

class Solution {
    public int removeDuplicates(int[] nums) {

        int count = 1;
        int j=1;

        for (int i=1;i<nums.length;i++) {
            if (nums[i] == nums[i-1]) {
                count++;
                if (count <= 2) {
                    nums[j] = nums[i];
                    j++;
                }
            } else {

                nums[j] = nums[i];
                j++;

                count=1;
            }
        }
        return j;
        
    }
}




class Solution  {
    public List<int[]> optimal(List<int[]> a , List<int[]> b, int target) {
        Collections.sort(a, (i,j) -> Integer.compare(i[1], j[1]));
        Collections.sort(b, (i,j) -> Integer.compare(i[1], j[1]));
        List<int[]> result = new ArrayList<>();
        int low = 0;
        int high = b.size()-1;
        int prevsum =0;
        while (low < a.size() && high >= 0) {
            int[] temp1 = new int[2];
            int[] temp2 = new int[2];
            temp1 = a.get(low);
            temp2 = b.get(high);
            int sum = temp1[1] + temp2[1];
            if ( sum <= target) {
                if (sum > prevsum) {
                    prevsum = sum;
                     result.remove(result.size()-1);
                }
                if (sum == prevsum )
                {
                    result.add(new int[]{temp1[0], temp2[0]});
                }
                low++;
            } else if (sum > target) {
                high--;
            }
        }
        return result;
    }
}
