import java.util.*;

class CircularArrayLoop {
    public boolean circularArrayLoop(int[] nums) {
        if(nums.length < 2) return false;
        int slow = 0;
        int fast = 0;
       // int length = 0;
        boolean isLoopBackward = false;
        //int loopStart = 0;
        //int loopEnd = 0;
        Stack<Integer> path = new Stack<>();
        path.push(slow);
        System.out.print(slow + "->");        
        do {            
            if(nums[slow] > 0){                
                int prevSlow = slow;
                slow = (slow + nums[slow])%nums.length;                                 
                
                // length = length + (slow > prevSlow ? (slow - prevSlow) : ((nums.length - prevSlow) + slow));
               // System.out.println("length " + length);            
                System.out.print(slow+"->");
                
                fast = (fast + nums[fast])%nums.length;            
                fast = (fast + nums[fast])%nums.length;            
            }      
            else {
                isLoopBackward = true;
            }
            path.push(slow);
            
            
        }while(slow != fast && !isLoopBackward);
       // System.out.println("length "+ length);
       //path.push(slow);
       int length = 0;
       int loopEnd = slow; 
       // path.pop();
       System.out.println(path);
       while(!path.isEmpty())
       {
           length++;
           if(path.peek() != loopEnd) path.pop();
           else break;
       }


       System.out.println("length " + length);        
        if(!isLoopBackward && length > 1) return true;
        
        return false;
    }
    
    
    
    public boolean circularArray(int[] nums){
        if(nums.length < 2) return false;
        int slow=0, fast=0;
        boolean isLoopBackward = nums[0] < 0 ? true : false;
        Stack<Integer> path = new Stack<>();
        path.push(slow);

        System.out.print(slow+"->");
        slow = (slow + nums[slow]) % nums.length;
        System.out.print(slow+"->");
        path.push(slow);
        fast = (fast + nums[fast]) % nums.length;
        fast = (fast + nums[fast]) % nums.length;

        while((slow != fast) && (slow < nums.length)){

            // to check loop flow change
            if(isLoopBackward){
                if(nums[slow] > 0) return false; 
            }
            else {
                if(nums[slow] < 0) return false;
            }

            // check if loop present
            slow = (slow + nums[slow]) % nums.length;
            System.out.print(slow+"->");
            fast = (fast + nums[fast]) % nums.length;
            fast = (fast + nums[fast]) % nums.length;
            path.push(slow);
        }
        
        
        // Length calc
        System.out.println(path);
        int size = path.size();
        int loopEnd = path.pop();
        
        int length = 0;
        while(!path.isEmpty()){
            if(path.peek() != loopEnd){                
                length++; path.pop();
            } 
            else{
                length++;
                break;
            }
        }

        System.out.println("length " + length + " size " + size);

        if(slow == fast) return true;

        return false;
    }
    public static void main(String[] args){
        System.out.println("Circular Array Loop");
        int[] nums = {2,2,2,2,2,4,7};
       //int[] nums = {2,-1,1,2,2};
        CircularArrayLoop obj = new CircularArrayLoop();
        System.out.println(obj.circularArray(nums));
    }
}