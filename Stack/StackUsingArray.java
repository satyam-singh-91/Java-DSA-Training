package Stack;
//import java.util.*;

class Stack{
    int arr[];
    int top;
    int size;

    Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }

    void push(int x){
        if(top==size-1){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top]=x;
    }


    void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        } else {
            top--;
        }


    }
}

public class StackUsingArray {
    public static void main(String[] args) {
      
        Stack S= new Stack(10);

        S.push(10);
        S.push(20);


       
    }
}
