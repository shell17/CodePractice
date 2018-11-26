package com.practice;

import javax.xml.transform.sax.SAXSource;
import java.util.*;
import java.util.LinkedList;

public class Tree {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public Node root;

    public void insert(int data){
        Node node = new Node(data);
        if(root == null){
            root = node;
        }
        insertRec(root, node);
    }
    public void insertRec(Node latestRoot, Node node){
        if(latestRoot.data > node.data){
            if(latestRoot.left == null){
                latestRoot.left = node;
            }
            insertRec(latestRoot.left, node);
        }
        else if (latestRoot.data < node.data){
            if(latestRoot.right == null){
                latestRoot.right = node;
            }
            insertRec(latestRoot.right,node);
        }
    }

    public void inorder(Node currRoot){
        if(currRoot  == null)
            return;

        inorder(currRoot.left);
        System.out.println(" " + currRoot.data);
        inorder(currRoot.right);
    }
    public void printInorderTree(Node root){
        Node currRoot = root;
        inorder(currRoot);
    }

    public void preOrder(Node currRoot){
        if(currRoot == null)
            return;

        System.out.print(" " + currRoot.data);
        preOrder(currRoot.left);
        preOrder(currRoot.right);
    }
    public void printPreorderTree(Node root){
        Node currRoot = root;
        preOrder(root);
    }
    public void postOrder(Node currRoot){
        if(currRoot == null)
            return;

        postOrder(currRoot.left);
        postOrder(currRoot.right);
        System.out.print(" " + currRoot.data);
    }
    public  void printPostOrderTree(Node root){
        System.out.println();
        Node currRoot = root;
        postOrder(root);
    }
    public void dfs(Node root){
        Stack<Node> stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            Node currRoot= stack.pop();
            System.out.println(" " + currRoot.data);
            if(currRoot.left != null){
                stack.push(currRoot.left);
            }
            else if(currRoot.right != null){
                stack.push(currRoot.right);
            }
        }
    }
    public void bfs(Node root){
        Queue<Node> queue = (Queue<Node>) new LinkedList();

        queue.add(root);
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            System.out.println(" " + curr.data );
            if(curr.left != null){
                queue.add(curr.left);
            }
            else if(curr.right != null){
                queue.add(curr.right);
            }
        }

    }

    public static void main(String[] args){

        Tree tree = new Tree();
        tree.insert(20);
        tree.insert(15);
        tree.insert(16);
        tree.insert(14);
        tree.insert(10);
        tree.insert(36);
        tree.insert(25);

//        tree.printInorderTree(tree.root);
//        tree.printPreorderTree(tree.root);
//        tree.printPostOrderTree(tree.root);
        /*System.out.println("dfs: ");
        tree.dfs(tree.root);
        System.out.println("bfs : ");
        tree.bfs(tree.root);*/

        tree.inorderIterative(tree.root);
    }

    private List<Integer> inorderIterative(Node root) {
        List<Integer> list = new ArrayList();
        Stack<Node> stack = new Stack<>();
        Node currRoot = root;
        while(currRoot != null || !stack.empty()){
            while(currRoot != null){
                stack.add(currRoot);
                currRoot = currRoot.left;
            }
            currRoot = stack.pop();
            list.add(currRoot.data);
            currRoot = currRoot.right;
        }

        return list;
    }
}
