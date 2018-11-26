package com.practice;

import static com.practice.SinglyLinkedlist.partitionList;
import static com.practice.SinglyLinkedlist.printLinkedList;
import static com.practice.SinglyLinkedlist.reverseLinkedList;

public class LinkedList {


    public static void main(String[] args){
        SinglyLinkedlist.Node head = new SinglyLinkedlist.Node(1);
      SinglyLinkedlist linkedList = new SinglyLinkedlist(head);

      linkedList.addToLast(new SinglyLinkedlist.Node(4));
      linkedList.addToLast(new SinglyLinkedlist.Node(5));
      linkedList.addToLast(new SinglyLinkedlist.Node(2));
      linkedList.addToLast(new SinglyLinkedlist.Node(3));
      linkedList.addToLast(new SinglyLinkedlist.Node(2));
      printLinkedList(head);
      /*SinglyLinkedlist.Node reveseHead = reverseLinkedList(head);
        System.out.println("After reverse");
      printLinkedList(reveseHead);*/
      SinglyLinkedlist.Node partHead = partitionList(head,3);
        System.out.println("After partition");
        printLinkedList(partHead);
    }




}
class SinglyLinkedlist{
    public Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        public int data(){ return data;}
        public Node next(){return next;}
    }
    public SinglyLinkedlist(Node head){
        this.head = head;
    }
    public static void printLinkedList(Node head) {
        Node curr = head;
        System.out.println("Linked list is :");
        while(curr != null){
            System.out.println(" " + curr.data);
            curr = curr.next();
        }
    }

    public static Node reverseLinkedList(Node currNode) {
        System.out.println("Again");
        printLinkedList(currNode);
        Node prevNode = null;
        Node nextNode;

        while(currNode != null){
            nextNode = currNode.next();
            currNode.next = prevNode;//reverse

            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    public  void addToLast(Node node) {
        if(head == null){
            head = node;
        }
        else{
            Node curr = head;
            while(curr.next() !=null)
                curr = curr.next();
            curr.next = node;
        }

    }

    public static Node partitionList(SinglyLinkedlist.Node head, int x) {

        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node curr1 = dummy1, curr2=dummy2;
        Node mid = null;
        while(head != null){
            if(head.data < x){
                curr1.next = head;
                curr1 =head;
            }
            else if(head.data > x){
                curr2.next = head;
                curr2 = head;
            }
            else{
                mid = head;
            }
            head= head.next();
        }
        curr2.next = null;
        curr1.next = mid;
        mid.next = dummy2.next();
        return dummy1.next();

    }

    public Node addTwoLists(Node head1, Node head2) {
        //SinglyLinkedlist.Node head = new SinglyLinkedlist.Node(0);
        //SinglyLinkedlist result = new SinglyLinkedlist(head);
        Node result = new Node(0);
        Node resultTail = null;
        Node l1 = head1;
        Node l2 = head2;
        Node dummy = new Node(0);
        Node head = null;
        Node curr = dummy;

        int carry = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                int sum = l1.data + l2.data + carry;
                if (sum > 10) {
                    carry = 1;
                } else {
                    carry = 0;
                }

                if (head == null) {
                    int a = sum % 10;
                    head.data = a;
                    curr = head;
                } else {
                    curr.data = sum % 10;
                    curr = curr.next;
                }

                l1 = l1.next();
                l2 = l2.next();
            } else {
                while (l1 != null) {
                    curr.data = l1.data;
                    curr = curr.next();
                    l1 = l1.next();
                }
                while (l2 != null) {
                    curr.data = l2.data;
                    curr = curr.next();
                    l2 = l2.next();
                }
            }

        }//end of outer while

        //add carry here
        if (carry == 1)
            {
                curr.data = 1;
                curr = curr.next();
            }

            return head;
        }


}
