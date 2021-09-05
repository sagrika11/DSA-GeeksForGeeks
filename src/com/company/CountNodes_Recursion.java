package com.company;
 class L{
    int data;
    L next;
    L (int id){
        this.data = id;
        this.next=null;

    }
}
class LinkedList_{
     L head;
    public void create(int data){
        L node = new L( data);
        node.next=head;
        head = node;
    }
    public int gc(L node){
        if(node==null)
            return 0;
        return 1+ gc(node.next);
    }
    public int getCount(){
        return gc(head);
    }
}
public class CountNodes_Recursion {
    public static void main(String[] args) {
        LinkedList_ y = new LinkedList_();
        y.create(8);
        y.create(4);
        y.create(2);
        y.create(82);
        System.out.println(y.getCount());
    }
}
