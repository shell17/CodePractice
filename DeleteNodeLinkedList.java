package com.PracticeAgain;

import com.practice.Tree;

public class DeleteNodeLinkedList {

    static class Node1{
        int data;
        Node1 next;
        Node1(int data){
            this.data = data;
        }
    }
    Node1 head = null;
    public void printList(Node1 root){
        while(root!=null){
            System.out.print(" " + root.data);
            root = root.next;
        }

    }
    public void deleteNode(Node1 head, Node1 n){
        //if head is to be deleted
        if(head == n){

            if(head.next == null){
                System.out.println("single head node, cant delete");
                return;
            }

            head.data = head.next.data;
            head.next= n.next.next;


        }
        else{
            Node1 curr = head;
            while(curr != n && curr.next!= null){
                curr = curr.next;
            }
            if(curr == null){
                System.out.println("Node not  found!!");
                return;
            }

            curr.next = curr.next.next;
            System.gc();


        }
    }

    public static void main(String[] args){
        DeleteNodeLinkedList L = new DeleteNodeLinkedList();
        L.head = new Node1(1);
        L.head.next = new Node1(2);
        L.head.next.next = new Node1(3);
        L.head.next.next.next = new Node1(4);
        L.head.next.next.next.next = new Node1(5);

        L.printList(L.head);
        L.deleteNode(L.head,L.head.next.next );
        System.out.println();
        L.printList(L.head);



    }
}
