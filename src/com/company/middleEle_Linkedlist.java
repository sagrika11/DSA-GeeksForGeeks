package com.company;
class NodeM{
    int data;
    NodeM next;
    NodeM(int id){
        data=id;
        next=null;
    }
}
public class middleEle_Linkedlist {
    NodeM head,tail;
    public void create(int data){
        NodeM node = new NodeM(data);
        node.next=null;
        if(head==null){
            head=tail=node;
        }
        else {
            tail.next=node;
            tail=node;
        }
    }
    public void middle(){
        NodeM slow =head,fast = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Middle Element of LinkedList : " +slow.data);
    }
    public static void main(String[] args) {
        middleEle_Linkedlist ms = new middleEle_Linkedlist();
        ms.create(8);
        ms.create(67);
        ms.create(12);
        ms.create(90);
        ms.create(100);
        ms.create(6);
        ms.middle();
    }
}
