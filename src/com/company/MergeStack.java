package com.company;

import java.util.*;

class Node_{
    int data;
    Node_ next;
    Node_ pre;
    Node_(int data){
        this.data=data;
        this.next=null;
        this.pre=null;
    }
}
// here we have to traverse one pointer and make it top pointer while remaining will be pointing toward the first node
public class MergeStack {
    Node_ head, tail;

    public void push(int data){
        Node_ node = new Node_(data);
        node.next=null;node.pre=null;
        if(head==null){
            head=node;
            tail=node;

        }
        else {
            node.pre=tail;
            tail.next=node;
            tail=node;

        }
    }
    public void pop(){
        if(head==null){
            System.out.println("Stack is underFlowing");
        }
        else if(head==tail){
            head=tail=null;
        }
        else {
         tail = tail.pre;
         tail.next= null;
        }
    }
    public void merge(MergeStack s){
      head.pre=s.tail;
      s.tail.next=head;
      head=s.head;
      s.tail=null;
      s.head=null;
    }
    public void show(){
     if(tail!=null){
         Node_ n =tail;
         while (n!=null){
             System.out.println(n.data);
             n= n.pre;
         }

     }


    }
    public static void main(String[] args) {
        MergeStack ms = new MergeStack();
        MergeStack ms2 = new MergeStack();
        ms.push(6);
        ms.push(5);
        ms.push(4);
        ms2.push(9);
        ms2.push(8);
        ms2.push(7);
        ms.pop();
        ms2.pop();
      ms.merge(ms2);

        ms.show();
    }
}
