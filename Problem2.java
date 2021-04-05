//Merge sorted array
// Time Complexity : O(m+n)
// Space Complexity : Constant - O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Two pointer approach. One pointer points to mth element of first array(array a) and another
// to nth element of second array(array b). COmpare them and push them in the last index of arraya a. 
// Your code here along with comments explaining your approach
class Problem2{
    public static void main(String[] args){
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,5,6};
        int m = 3, n=3;
        mergeSorted(a, b, m, n);
        for(int num : a){
            System.out.print(" "+num);
        }

    }
    public static void mergeSorted(int[] a, int[] b, int m, int n ){
        int p1 = m-1, p2 = n-1;
        int lastIndex = m+n-1;
        while(p2 >=0 && p1 >=0){
            if(b[p2] >a[p1]){
                a[lastIndex] = b[p2];
                p2--;
            }
            else{
                a[lastIndex] = a[p1];
                p1--;
            }
            lastIndex--;
        }
        //if pointer p2 is has not reached 0th index
        while(p2 >= 0){
            a[lastIndex] = b[p2];
            p2--;
        }
        
    
    }

}

