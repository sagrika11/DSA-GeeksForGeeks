package com.company;
class LL{
    int data;
    LL next;
}
class LinkedList{
    LL head, tail;
    int count1=0;
    public void creation(int data){
        LL node = new LL();
        node.data= data; node.next=null;
        if (head== null){
            head=tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }

    }
     public void count(){

        LL temp = head;
         System.out.println("Total number of Nodes : ");
        while (temp!=null){
            count1++;
            temp = temp.next;
        }
         System.out.println(count1);
     }
    public void deleteGivenData(int key){
        LL temp =head,pre =null;
//importance of return statement
        if(temp!=null && temp.data==key){
            head= temp.next;
          return;
        }
        while (temp!=null&& temp.data !=key){
            pre = temp;
            temp= temp.next;
        }
        if(temp==null)
            return;
        pre.next = temp.next;
    }
    public void show(){
        LL tem = head;
        System.out.println("After Deleting the given key");
        while (tem!=null){
            System.out.print(tem.data + " ");
            tem= tem.next;
        }
    }

    public void returnData(int index)
    {
        LL temp = head;
        int i =1;
        System.out.println("Data at index " +index + ": ");
        while (i<index){
            temp=temp.next;
            i++;
        }
        System.out.println(temp.data);
    }
    public void printFromEnd(int index){
        LL temp = head;
        int len =0;
        while (temp!=null){
            temp=temp.next;
            len++;
        }

        if(len<index)
            return;
        temp =head;
        for (int i = 1; i <len-index+1 ; i++) {
            temp=temp.next;

        }
        System.out.println(temp.data);
    }
}
public class DeleteGivenData {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.creation(3);
        l.creation(5);
        l.creation(1);
        l.creation(9);
        l.creation(6);
        //l.deleteGivenData(3);
        //l.count();
        //l.returnData(5);

        l.printFromEnd(7);
        l.show();
    }
}
