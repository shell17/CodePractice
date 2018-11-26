package com.PracticeAgain;

public class FlattenLinkedList {

    static class Node2{
        int data;
        Node2 right;
        Node2 down;
        Node2(int data){
            this.data = data;
            right = down = null;
        }
    }

    Node2 head;
    public void addToRight(Node2 node){
        if(head==null){
            head = node;
        }
        else{
            Node2 curr = head;
            while(curr.right != null){
                curr=curr.right;
            }
            curr=node;
        }
    }
    public void addToDown(Node2 node){
        if(head==null){
            head = node;
        }
        else{
            Node2 curr = head;
            while(curr.down != null){
                curr=curr.down;
            }
            curr=node;
        }
    }

    public Node2 merge(Node2 a, Node2 b){

        //base case
        if(a==null)
            return b;
        if(b==null)
            return a;

        Node2 result;
        if(a.data < b.data){
            result = a;
            result.down = merge(a.down,b);
        }
        else{
            result = b;
            result.down = merge(a,b.down);
        }

        return result;
    }
    public Node2 flatten(Node2 root){
        //base case
        if(root== null || root.right == null)
            return root;

        root.right = flatten(root.right);

        root = merge(root, root.right);

        return root;
    }

    public void printList(Node2 root){
        while(root!=null){
            System.out.print(" " + root.data);
            root = root.down;
        }

    }

    public static void main(String[] args){

        FlattenLinkedList L = new FlattenLinkedList();
        L.head = new Node2(5);
        L.head.right = new Node2(10);
        L.head.down = new Node2(7);
        L.head.down.down = new Node2(8);
        L.head.down.down.down = new Node2(30);
        L.head.right.down = new Node2(20);
        L.head.right.right = new Node2(19);
        L.head.right.right.down = new Node2(22);
        L.head.right.right.down.down = new Node2(50);
        L.head.right.right.right = new Node2(28);
        L.head.right.right.right.down = new Node2(35);
        L.head.right.right.right.down.down = new Node2(40);
        L.head.right.right.right.down.down.down = new Node2(45);

        L.head = L.flatten(L.head);
        L.printList(L.head);

    }

}
