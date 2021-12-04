package Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CustomQueue {

    public static class CustomQueue1 {
        int[] data;
        int front;
        int size;

        public CustomQueue1(int cap) {
            data = new int[cap];
            front = 0;
            size = 0;
        }

        int size() {
            // write ur code here
            return size;
        }

        void display() {
            // write ur code here
            for(int i = 0; i < size; i++){
                int idx = (front + i) % data.length;
                System.out.print(data[idx] + " ");
            }
            System.out.println();
        }

        // change this code
        void add(int val) {
            // write ur code here

            if(size == data.length){
                int[] newArray = new int[2*data.length]; // if size is full then creating new array of double size
                for(int i=0;i<data.length;i++){
                    newArray[i] = data[i];
                }


                data = newArray; // making old array point to new array

            }
            int idx = (front + size) % data.length; // based on size front is found
            data[idx] = val; // new element is added to found idx
            size++;

        }

        int remove() {
            // write ur code here
            if(size == 0){
                System.out.println("Queue underflow");
                return -1;
            } else {
                int val = data[front];

                front = (front + 1) % data.length; // incrementing front by one and decreasing size by 1
                size--;

                return val;
            }
        }

        int peek() {
            // write ur code here
            if(size == 0){
                System.out.println("Queue underflow");
                return -1;
            } else {
                int val = data[front];
                return val;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomQueue1 qu = new CustomQueue1(n);

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("add")){
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if(str.startsWith("remove")){
                int val = qu.remove();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("peek")){
                int val = qu.peek();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("size")){
                System.out.println(qu.size());
            } else if(str.startsWith("display")){
                qu.display();
            }
            str = br.readLine();
        }
}

}

//input
// 5
//add 10
//display
//add 20
//display
//add 30
//display
//add 40
//display
//add 50
//display
//add 60
//display
//peek
//remove
//display
//peek
//remove
//display
//peek
//remove
//display
//peek
//remove
//display
//peek
//remove
//display
//peek
//remove
//quit
