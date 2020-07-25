//Time Complexity : O(m+n)
//Space Complexity : O(1)
/*Approach 
-comparing from the last pointer of both the array which is m and n
-greater amongst them will be kept at its position in larger array,decrementing any of the
pointers when the number is kept in its position in larger array
-at last remaining elements of smaller array will be kept in larger array
*/
public class Merge{

    public static void merge(int[] A, int m, int[]B, int n) {
        while(m>0 && n>0)
        {
            if(A[m-1] > B[n-1])
            {
                A[m+n-1] = A[m-1];
                m--;
            }
            else
            {
                A[m+n-1] = B[n-1];
                n--;
            }
        }
        
        while(n > 0)
        {
            A[m+n-1] = B[n-1];
            n--;
        }
    }

    public static void main(String args[]){
        int arr1[] = new int[]{1,2,3,0,0,0};
        int arr2[] = new int[]{2,5,6};
        merge(arr1,3,arr2,3);
        for(int i=0; i < arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

    }

}