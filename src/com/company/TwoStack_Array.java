package com.company;

import java.util.Scanner;

public class TwoStack_Array {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    int top1 =n/2+1;
    int top2 = n/2;
   public void push1(int data){
       if(top1>0){
           top1--;
           array[top1]=data;
       }
       else {
           System.out.println("Stack OverFlow");
       }
   }
   public void push2(int data){
       if(top2<n-1)
       {
           top2++;
           array[top2]=data;
       }
       else {
           System.out.println("Stack OverFlow");
       }
   }
   public void pop1(){
       if(top1<=n/2){
           int x = array[top1];
           top1++;
           System.out.println("Popped element of Stack_1 : " +x);
       }
       else {
           System.out.println("Stack UnderFlow");
       }
   }
   public void pop2(){
       if(top2>=n/2+1){
           int x= array[top2];
           top2--;
           System.out.println("Popped element of Stack_2 : " +x);
       }
       else {
           System.out.println("Stack UnderFlow");
       }
   }
   public void show(){
       System.out.print("Stack Element in the Arrays are : ");
       for (int i = top1; i <=top2 ; i++) {
           System.out.print(array[i] + " ");
       }
   }
    public static void main(String[] args) {
        TwoStack_Array ts = new TwoStack_Array();
        ts.push1(45);
        ts.push1(67);
        ts.push2(65);
        ts.push1(23);
        ts.push2(20);
        ts.push1(100);
        ts.pop1();
        ts.pop2();

       ts.show();



    }
}
