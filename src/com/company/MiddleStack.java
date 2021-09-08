package com.company;
class Node {
    Node next;
    Node pre;
    int data;
    Node(int d){
        this.data=d; this.next=null; this.pre=null;
    }
}
public class MiddleStack {
    Node dummy = new Node(-1);
    Node top=dummy,middle =dummy;
    int count=0;
    public  void push(int data) {
        Node node = new Node(data);
        node.pre = null;
        node.next = top;
        count++;
        top.pre = node;
        top = node;
        if (count == 1) {
            middle = node;
        } else if (count % 2 == 0) {
            middle = middle.pre;
        }
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
        if(count%2==1){
            middle = middle.next;
        }
        System.out.println("Popped Element is : " + x);
    }
    public void Mid(){
        if(count==0){
            System.out.println("Stack is Empty");
        }
        System.out.println("Middle element is : " +middle.data);
    }
    public void show(){
        Node temp =top;
        if(count==0){
            System.out.println("Stack is Empty");
        }
        for (int i = 0; i <count ; i++) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        MiddleStack ms = new MiddleStack();
        ms.push(78);
        ms.push(23);
        ms.push(90);
        ms.push(12);
        ms.push(56);
        ms.push(8);
        ms.push(24);
        ms.pop();
        ms.Mid();


    }
}
