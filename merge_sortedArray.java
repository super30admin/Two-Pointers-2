
// Time Complexity :  here i am performing n+m read and write operation so time complexity would be o(n+m)
// Space Complexity : here i am using m size array as extra space so it would be o(m)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int l = m+n;
        int p1 = 0;
        int p2 = 0;
        int[] numcopy = new int[m];
        for(int i=0; i<m; i++){
            numcopy[i] = nums1[i];
        }
        
        for(int p=0; p<l; p++){
            
            
            if(p2>=n || (p1 < m && numcopy[p1] < nums2[p2])){
                nums1[p] = numcopy[p1];
                p1++;
            }else{
                nums1[p] = nums2[p2++];
            }
            
            
        }
        
        
        
    }
}