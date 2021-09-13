package com.company;

import java.util.Stack;

class Node {
    Node next;
    Node pre;
    int data;
    Node(int d){
        this.data=d; this.next=null; this.pre=null;
    }
}
public class MiddleStack {
   Node top,middle;
    int count=0;
    public  void push(int data) {
        Node node = new Node(data);
        node.pre = null;
        node.next = top;
        count++;


        if (count == 1) {
            middle = node;
        } else {
            top.pre = node;
            if (count % 2 != 0)
                middle = middle.pre;
            }

        top = node;
    }
    public void pop(){
        if(count==0){
            System.out.println("Stack is Empty");

        }
        Node temp = top;
        int x = top.data;
        top=top.next;
        if(top!=null)
            top.pre=null;
        count--;
        if(count%2==0){
            middle = middle.next;
        }
        System.out.println("Popped Element is : " + x);
    }
    public void Mid(){
        if(count==0){
            System.out.println("Stack is Empty");
        }
        System.out.println("\nMiddle element is : " +middle.data);
    }

    public void show(){
        Node temp =top;
       while (temp !=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MiddleStack ms = new MiddleStack();
        ms.push(78);
        ms.push(23);
        ms.push(34);
        ms.push(90);

        ms.Mid();
        ms.show();





    }
}
