package CollectionFramework.Stack;

public class Stack {

    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int size){
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value){
        if(top == capacity-1){
            System.out.println("Stack overflow!");
            return;
        }
        stack[++top] = value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }


    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.print("Stack : ");
        for(int i = 0 ; i <= top; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
