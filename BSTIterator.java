// Time Complexity :
// next() function = Amortized O(1), O(h) in the worst case
// hasNext() function = O(1)
// Space Complexity : O(h), which comes from the stack
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// We can solve this question by traversing in-order and storing in an array and then keeping a global idx to keep track of which element is next in line for a next() function call.
// Better approach: We create a global stack to store all the elements. The constructor will load the stack with the left elements till it reaches null.
// next() will pop the topmost element and call a dfs on its right element, and will return the popped elements value
// hasNext() will check the stack and return false if the stack is empty

// Your code here along with comments explaining your approach
class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        dfs(root);
    }

    public int next() {
        TreeNode popped = stack.pop();
        dfs(popped.right);
        return popped.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        while (root!=null) {
            stack.add(root);
            root=root.left;
        }
    }
}