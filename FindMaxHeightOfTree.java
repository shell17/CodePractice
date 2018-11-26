package com.practice;

public class FindMaxHeightOfTree {

    Node1 root;

    public static int maxHeightOfTree(Node1 node){

        if(node  == null)
            return 0;
        else{
            int lDepth = maxHeightOfTree(node.left);
            int rDepth = maxHeightOfTree(node.right);

            if(lDepth > rDepth)
                return (lDepth+1);
            else
                return (rDepth+1);
        }

    }

    public static void main(String[] args){
        FindMaxHeightOfTree tree = new FindMaxHeightOfTree();
        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(5);
        tree.root.left.left = new Node1(3);
        tree.root.left.right = new Node1(4);

        int h = tree.maxHeightOfTree(tree.root);
        System.out.println("Height is : " +h);


    }
}
class Node1{
    int data;
    Node1 left;
    Node1 right;

    Node1(int data){
        this.data = data;
        this.left = this.right = null;
    }


}
