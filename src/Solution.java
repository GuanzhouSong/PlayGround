import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode cur = root;
        List<Integer> res = new ArrayList<>();
        while(cur != null){
            res.add(cur.val);
            if(cur.right!=null){
                stack.push(cur.right);
            }
            cur = cur.left;
            if(cur == null && !stack.isEmpty()){
                cur = stack.pop();
            }
        }

        return res;
    }
}