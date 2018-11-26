package com.PracticeAgain;

import java.util.Stack;

public class QueueUsingStacks {

    static class MyQueue{

        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();


        public void add(int data){
            //use stack1 as top element is recently added .
            //push everthing from stack1 to stack2 , next push new elemenet in stack1 and then push from stack 2 to tack1
            if(!stack1.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                //now stack2 is full
                stack1.push(data);
                while(!stack2.isEmpty()){
                    stack1.push(stack2.pop());
                }
            }
            else{
                stack1.push(data);
            }

        }

        public int remove(){
            //stack1 is always latest - so pop topone
            if(stack1.isEmpty()){
                System.out.println("Error - queue is empty");
                System.exit(0);
            }

            int x = stack1.peek();
            stack1.pop();
            return x;


        }



        public boolean isEmpty(){
            if(stack1.isEmpty()){
                return true;
            }
            return false;
        }

    }

    public static void main(String[] args){
        MyQueue mq = new MyQueue();
        mq.add(1);
        mq.add(2);
        mq.add(3);
        System.out.println("1st ele : " + mq.remove());




    }
}
