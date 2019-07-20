// Time Complexity :O(n) --> beacuse of for loop
// Space Complexity :1
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. Used Linked List to store elemts in ascending order .
// 2. Traverse through this linked list to get the elements in ascending order and replace them with elements in nums1.
public class MergeSortedArray {
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public  void mergeArrays(int[] nums1,int[] nums2,int m,int n){
        int i = 0,j = 0;
        Node head = new Node(0);
        Node dummy = head;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                Node temp = new Node(nums1[i]);
                head.next = temp;
                head = head.next;
                i++;
            }
            else{
                Node temp = new Node(nums2[j]);
                head.next = temp;
                head = head.next;
                j++;
            }
        }
        while(i<m){
            Node temp = new Node(nums1[i]);
            head.next = temp;
            head = head.next;
            i++;
        }
        while(j<n){
            Node temp = new Node(nums2[j]);
            head.next = temp;
            head = head.next;
            j++;
        }
        if(dummy.next!=null)
            dummy = dummy.next;
        i = 0;
        while(dummy!=null){
            nums1[i] = dummy.data;
            dummy = dummy.next;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,5,6,0,0,0};
        int[] arr2 = {2,3,4};
        MergeSortedArray obj = new MergeSortedArray();
        obj.mergeArrays(arr1,arr2,3,arr2.length);
        for(int i : arr1)
            System.out.print(i+"  ");
    }
}
