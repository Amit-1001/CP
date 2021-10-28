package Queue;

public class EfficieantQueue {
// Array is circular
    //https://practice.geeksforgeeks.org/tracks/DSASP-Queue/?batchId=154


    // here we are maintaining front cap and size , rare
    static int[] arr;
    static  int cap;
    static int front;
    static int size;
    static  int rare;


    EfficieantQueue(int c){
        arr = new  int[c];
        cap = c;
        front =0;
        size = 0;
        rare = c-1;

    }

    public  static  void  enqueue(int data){
        if(isFull()){
            return;
        }
        rare  = (rare+1) % cap;
        arr[rare] = data;
        size = size + 1;


    }

    public  static  void  dequeue(){
            if(isEmpty()){
                return;
            }
            front = (front + 1) % cap;

        System.out.println("Dequeued:"+arr[front -1 ]);
            size --;

    }

    public  static  int getFront(){
        if(isEmpty()){
            return  -1;
        }
        return arr[front];
    }

    public  static  int getRare(){
        if(isEmpty()){
            return  -1;
        }
        int r = (front + size - 1) % cap; // to find rare in circular array
        return arr[r];
    }


    public static  boolean isFull(){
        return  (size == cap);
    }

    public  static  boolean isEmpty(){
        return  (size ==0);
    }

    public static void main(String[] args) {
        EfficieantQueue q1 = new EfficieantQueue(5);

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        System.out.println("Front:"+getFront());
        System.out.println("Rare:"+getRare());

        dequeue();
        dequeue();


        System.out.println("Front:"+getFront());
        System.out.println("Rare:"+getRare());



    }
}
