package com.example.helloworld;

public class ReverseLinkedList {
    public static void main(String[] args){
        SinglyLinkedList.Node head = new SinglyLinkedList.Node(1);
        SinglyLinkedList linkedList = new SinglyLinkedList(head);
        linkedList.add(new SinglyLinkedList.Node(2));
        linkedList.add(new SinglyLinkedList.Node(3));

        linkedList.print();
        linkedList.reverse();
        System.out.println("\n After reverse \n");
        linkedList.print();


    }


}
class SinglyLinkedList{

    static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
        public int data(){
            return data;
        }
        public Node next(){
            return next;
        }
    }
    private Node head;
    public SinglyLinkedList(Node head){
        this.head = head;
    }

    public void add(Node node){

            Node current = head;
            while(current.next != null){
                current = current.next();
            }
            current.next = node;

    }

    public void print(){
        Node node = head;
        while(node != null){
            System.out.println(" " + node.data);
            node = node.next();
        }
    }

    public void reverse(){
        Node prev = null, curr = null, pointer=head;

        while(pointer != null){
            curr = pointer;
            pointer = curr.next();

            //reverse link
            curr.next = prev;
            prev = curr;
            head = curr;

        }
    }
}
