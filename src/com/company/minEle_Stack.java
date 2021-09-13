package com.company;

import java.util.Stack;
//Order of O(1) TIME and O(1)Space time
public class minEle_Stack {
    Stack<Integer> s = new Stack<>();
    int min = Integer.MAX_VALUE;
    public void push(int data){
        if(s.empty()){
            min = data;
            s.push(data);
        }
        else {
            int x = data;
            if(data<=min){
                x=2*data-min;
                min=data;
            }
            s.push(x);
        }
    }
    public void pop(){
        int v = s.peek();
        if(v>=min){
            s.pop();
        }
        else {
            int y = 2*min-v;
            s.pop();
            min=y;
        }
    }
    public int getMin(){
        return min;
    }
    public static void main(String[] args) {
        minEle_Stack ms = new minEle_Stack();
        ms.push(56);
        ms.push(-45);
        ms.push(13);
        ms.push(45);
        ms.push(100);
        System.out.println("Minimum Element : " + ms.getMin());
    }
}
