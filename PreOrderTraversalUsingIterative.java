package com.practice;

import java.util.Stack;

public class PreOrderTraversalUsingIterative {

    public static void main(String[] args){
        BinaryTree bt = BinaryTree.create();
        System.out.println("Preorder: ");
        bt.preOrderIterative();
    }
}
class BinaryTree{
    private TreeNode root;

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            left = right = null;
        }
        boolean isLeaf(){
            return left == null ? right == null : false;
        }

    }

    public void preOrderIterative(){

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            System.out.println("data : " + curr.data);

            if(curr.right!=null){
                stack.push(curr.right);
            }
            if(curr.left!=null){
                stack.push(curr.left);
            }
        }
    }


    public static BinaryTree create(){
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        tree.root = root;
        tree.root.left = new TreeNode(2);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(4);

        tree.root.right = new TreeNode(5);
        tree.root.right.right = new TreeNode(6);
        return tree;

    }
}
