package qihang.algorithm.binarytree.traversal.iterative;

import qihang.algorithm.binarytree.helper.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int num = queue.size();
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                TreeNode node = queue.removeFirst();
                tempList.add(node.val);
                if (node.left != null) {
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    queue.addLast(node.right);
                }
            }
            result.add(tempList);
        }
        return result;
    }
}
