
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes (brute force solution)
// Three line explanation of solution in plain english
// We are taking extra array to store the new array. With the help of two pointers we are moving 
// through the array 1 and 2. comparing each element from each array and finding smaller one.
// Smaller element goes into new array and index is increased.

// Your code here along with comments explaining your approach


class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        
        int[] res=new int[a.length];
        int i=0;
        int j=0;
        int h=0;

        while(i<m && j<n){

            if(a[i]<b[j]){
                res[h]=a[i];
                h++;
                i++;
            }
            else if(a[i]>b[j]){
                res[h]=b[j];
                h++;
                j++;
            }
            else{
                res[h]=a[i];
                h++;
                res[h]=a[i];
                h++;
                i++;
                j++;
            }
            
           
        }
         while(i<m){
                res[h]=a[i];
                h++;
                i++;
            }
            while(j<n){
                res[h]=b[j];
                h++;
                j++;
            }
        
        for(int k=0;k<res.length;k++){
            a[k]=(res[k]);
        }
        
        
    }
}