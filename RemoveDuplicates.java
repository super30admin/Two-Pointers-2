/**
 * # Idea: 
 * 1. Two pointers - one to track current position and one to iterate
 * 2. Check for current and iteration pointer if not equal, move current pointer by one position
 * 3. copy value of iter pointer to curr pointer. 
 * 
 * # Time complexity : O(n)
 * # Space complexity : O(1) - no extra space
 * 
 */

class RemoveDuplicates {
    public int removeDuplicates(int[] A) {
        if (A.length == 0 || A.length == 1) return A.length;
         
        int curr = 0;
        //int cur; 
         
        for (int iter = 1; iter < A.length; iter ++){
            if (A[iter] != A[curr]){
                curr++;
                A[curr]= A[iter];
            }
        }
         
        return curr+1;
    }
    public static void main(String[] args){
        System.out.println("Remove Duplicates");
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] A = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        obj.removeDuplicates(A);
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
}