package com.PracticeAgain;

public class Add2NumsLinkedList {
    /**
     * Definition for singly-linked list.*/
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }



        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode dummy = new ListNode(0);
            ListNode head = null;
            ListNode curr = dummy;

            int carry =0;
            while( l1!= null || l2 != null){
                if(l1!=null && l2!= null){
                    int sum = l1.val + l2.val + carry;

                    if(sum >= 10){
                        carry=1;
                    }
                    else{
                        carry=0;
                    }

                    if(head == null){
                        int a= sum%10;
                        head = new ListNode(a);
                        curr = head;
                    }
                    else{
                        curr.next = new ListNode(sum%10);
                        curr= curr.next;
                    }

                    l1=l1.next;
                    l2=l2.next;
                }
                else{


                    while(l1!=null){
                        int sum = l1.val+carry;
                        if(sum>=10){
                            carry=1;
                        }
                        else{
                            carry=0;
                        }
                        curr.next = new ListNode(sum%10);
                        curr=curr.next;
                        l1=l1.next;
                    }
                    while(l2!=null){
                        int sum = l2.val+carry;
                        curr.next = new ListNode(sum%10);
                        System.out.println("sum: " + sum);
                        if(sum>=10){
                            carry=1;
                            System.out.println("carry: " + carry);

                        }
                        else{
                            carry=0;
                        }

                        curr=curr.next;
                        l2=l2.next;
                    }
                }

            }//end of outer while

            //add carry here
            if(carry==1){{
                curr.next = new ListNode(1);
                curr=curr.next;
            }


            }

            return head;



        }

    }
