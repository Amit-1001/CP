package stack;

import java.util.ArrayList;
import java.util.Stack;

public class implementStackByArrayList {
   static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        implementStackByArrayList obj = new implementStackByArrayList();

        obj.push(10);
        obj.push(20);
        obj.push(30);

        obj.pop();
        obj.pop();

        obj.peek();

    }

    private void peek() {
        int top =arr.get(arr.size()-1);
        System.out.println("Top:"+top);
    }

    private void pop() {
        if(arr.size()==0){
            return;
        }
        int last = arr.get(arr.size()-1);
        System.out.println("Popped:"+last);
        arr.remove(arr.size()-1);
    }

    private void push(int data) {
            arr.add(data);
    }
}
