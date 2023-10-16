//Time Complexity – O(m+n)
//Space Complexity – O(1)
// Did this code successfully run on Leetcode :
class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        //declaring the initials
        int i = m-1;
        int k = (m+n) - 1;
        int j = n-1;

        while(i>=0 && j>=0){
            if(num1[i] >= num2[j]){
                //swapping from num1 array
                num1[k] = num1[i];
                i--;
                k--; 
            }
            else{
                //swapping from num2 array
                num1[k] = num2[j];
                j--;
                k--;
                   
            }
        }
           while(j >= 0){
                num1[k] = num2[j];
               j--;
               k--;
           } 
        }
    }
