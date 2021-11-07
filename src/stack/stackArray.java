package stack;

public class stackArray {
    static int[] arr = new int [100];
    static int top = -1;

    public static void push(int data){
        if(top>99){
            System.out.println("Stack is overflow");
        }
        else {
            arr[++top] = data;
        }
    }


    public static void pop(){
        if(top<0){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Popp ed :"+arr[top--]);

        }
    }

    public static int peek(){
        if(top<0){
            System.out.println("Stack is empty");
        }
        return arr[top];
    }

    public static void main(String[] args){
        stackArray stack = new stackArray();
        stack.push(40);//first pushed
        stack.push(30);
        stack.push(20);
        stack.push(10);// last pushed

        stack.pop(); // LIFO

        System.out.println("Peek:"+stack.peek());// peek is 20 As 10 is popped before
    }
}
