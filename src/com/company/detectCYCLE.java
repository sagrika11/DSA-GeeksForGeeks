package com.company;
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
        this.next=null;
    }
}
class detectCycle_ll {
    Node1 head,tail;
    public void create(int data){
        Node1 node = new Node1(data);
        node.next=null;
        if(head==null){
            head=tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }

    public static void main(String[] args) {

    }
}
