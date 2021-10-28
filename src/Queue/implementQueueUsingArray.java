package Queue;

public class implementQueueUsingArray {
    static int size = 0;
    static int cap =0;
    //static int rare = 0;
    static int[] queue ;

        implementQueueUsingArray(int x){

            cap =x;
            size = 0;
            queue = new  int[cap];

        }

    public static  void enqueue(int data){

        if(isFull()){
            return;
        }

        queue[size] = data;
        size++;

    }

    public static void dequeue(){
        if(isEmpty()){
            return;
        }
        for(int i = 1; i <=size-1; i++){ // in this approach dequeue is costly
            queue[i-1] = queue[i];

        }
        size--;
    }

    public static int getFront(){
        if(isEmpty()){
            return  -1;
        }
        return queue[0];
    }

    public static int getRare(){
        if(isEmpty()){
            return -1;
        }
        return queue[size-1];
    }

    private static boolean isFull() {
        return (size == cap );
    }

    private static boolean isEmpty() {
        return ( size == 0);
    }


    public static void main(String[] args) {
        implementQueueUsingArray q1 = new implementQueueUsingArray(5);

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        System.out.println("Front is:"+getFront());
        System.out.println("Rare is:"+getRare());

        dequeue(); // 20 30 40
        dequeue(); // 30 40

        System.out.println("After Dequeue:");

        System.out.println("Front is:"+getFront());
        System.out.println("Rare is:"+getRare());

    }
}
