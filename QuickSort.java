package com.PracticeAgain;

import java.util.Stack;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {4,6,2,8,3,5,1};
        //quickSortIterative(arr,0,arr.length-1);
        quickSortIterativeAg(arr);
    }

    private static void quickSortIterativeAg(int[] arr) {

        Stack<Integer> stack = new Stack();
        stack.push(0);
        stack.push(arr.length-1);

        while(!stack.isEmpty()){
            int end = stack.pop();
            int start = stack.pop();
            if(end - start <2){
                continue;
            }

            int p = start + (end-start)/2;
            p = partitionAg(arr,p,start, end);

            stack.push(p);
            stack.push(end);

            stack.push(start);
            stack.push(p);

        }



    }

    private static int partitionAg(int[] arr, int pos, int start, int end) {
        int l = start;
        int h = end -1;
        int pivot = arr[pos];
        swap(arr,pos,end-1);
        while(l<=h){
            if(arr[l] < pivot){
                l++;
            }
            else if(arr[h] > pivot){
                h--;
            }
            else{
                swap(arr,l,h);
            }
        }

        return h;
    }

    private static void swap(int[] arr, int pos, int i) {
        int temp = arr[pos];
        arr[pos] = arr[i];
        arr[i] = temp;
    }


    private static void quickSortIterative(int[] arr, int l, int h) {
        int[] stack = new int[h-l+1];
        int top = -1;

        stack[++top] = l;
        stack[++top] = h;

        while(top>=0){
            h = stack[top--];
            l = stack[top--];

            int p = partition(arr,l,h);
        }
    }

    private static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l -1; //index of smaller element
        for(int j=l ; j<h-1;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        //swap arr[i+1] and pivot
        int temp = arr[i+1];
        //arr[i+1] =
 return -1;
    }
}
