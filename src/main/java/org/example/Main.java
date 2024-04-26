package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static class TreeTraversal {
        private List<TreeNode> result;

        public List<TreeNode> findNodesGreaterThanN(TreeNode root, int n) {
            result = new ArrayList<>();
            traverseTreeAndAddSuitable(root, n);
            return result;
        }

        private void traverseTreeAndAddSuitable(TreeNode node, int n) {
            if (node == null) {
                return;
            }
            if (node.getValue() > n) {
                result.add(node);
            }
            for (TreeNode child : node.getChildren()) {
                traverseTreeAndAddSuitable(child, n);
            }
        }
    }


    public static void main(String[] args) {
        TreeNode testTree = new TreeNode(20);
        for (int i=0;i<10;i++){
            TreeNode newNode = new TreeNode(i);
            for (int j=8;j<12;j++){
                TreeNode newNodeChild = new TreeNode(j);
                newNode.getChildren().add(newNodeChild);
            }
            testTree.getChildren().add(newNode);
        }

        TreeTraversal treeTraversal = new TreeTraversal();

        List<TreeNode> resultForN2 = treeTraversal.findNodesGreaterThanN(testTree, 2);
        List<TreeNode> resultForN8 = treeTraversal.findNodesGreaterThanN(testTree, 5);
        List<TreeNode> resultForN12 = treeTraversal.findNodesGreaterThanN(testTree, 8);
        List<TreeNode> resultForN15 = treeTraversal.findNodesGreaterThanN(testTree, 15);

        System.out.println(resultForN2.stream().map(TreeNode::getValue).toList());
        System.out.println(resultForN8.stream().map(TreeNode::getValue).toList());
        System.out.println(resultForN12.stream().map(TreeNode::getValue).toList());
        System.out.println(resultForN15.stream().map(TreeNode::getValue).toList());

    }
}