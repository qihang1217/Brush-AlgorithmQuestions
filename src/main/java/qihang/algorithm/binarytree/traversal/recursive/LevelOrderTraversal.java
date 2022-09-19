package qihang.algorithm.binarytree.traversal.recursive;

import qihang.algorithm.binarytree.helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

    public List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        setResult(root, 0);
        return result;
    }

    public void setResult(TreeNode root, int deep) {
        if (root == null) {
            return;
        }
        deep++;
        if (result.size() < deep) {
            //当层级增加时，list的Item也增加，利用list的索引值进行层级界定
            List<Integer> item = new ArrayList<Integer>();
            result.add(item);
        }
        result.get(deep - 1).add(root.val);

        setResult(root.left, deep);
        setResult(root.right, deep);
    }


}
