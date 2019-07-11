/**
 *     3
 *    / \
 *   9  20
 *      /  \
 *     15   7
 * maxDepth = 3
 */

public final class TreemaxDepth {
  public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            int left_height=maxDepth(root.left);
            int right_height=maxDepth(root.right);
            return java.lang.Math.max(left_height,right_height)+1;
        }
        
    }
}
