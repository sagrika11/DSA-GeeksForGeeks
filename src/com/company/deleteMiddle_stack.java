package com.company;

import java.util.Stack;

public class deleteMiddle_stack {

static void deleteMiddle( Stack<Integer> s ,int n, int current){
    //n =5, and current =0
      if(s.empty()||current==n){
          return;
      }
      int x = s.pop();

      deleteMiddle(s,n,current+1);
      if(current!=Math.ceil(n/2)){
          s.push(x);
      }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(78);
        s.push(23);
        s.push(34);
        s.push(90);

       deleteMiddle(s,s.size(),0);
        while(!s.empty()){
           int p =s.peek();
           s.pop();
            System.out.print(p+ " ");
        }

    }
}
