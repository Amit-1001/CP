package Array;

public class queueArray {
    static int[] arr = new int[5];
    static int front = -1; // deletion is done at front
    static int rear = 0; //insertion is done at read

    public static void Enqueue(int data){
        if(rear==arr.length){
            System.out.println("Queue is overflowed");
        }
        else
        {
            arr[rear++]= data;

        }

    }

    public static void Dequeue(){
        if(rear<=front){
            System.out.println("Queue is underflow");
        }
        else {
            System.out.println("Dequeued:"+arr[++front]);
        }

    }
    public static void main(String[] args) {
        queueArray q1 = new queueArray();

        q1.Enqueue(10); // first in
        q1.Enqueue(20);
        q1.Enqueue(30);
        q1.Enqueue(40);
        q1.Enqueue(50);
       // q1.Enqueue(60);


        q1.Dequeue(); //FIFO
        q1.Dequeue();
        q1.Dequeue();
        q1.Dequeue();
        q1.Dequeue();
        //q1.Dequeue();


    }
}
