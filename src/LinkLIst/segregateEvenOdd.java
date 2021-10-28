package LinkLIst;

public class segregateEvenOdd {

    Node head;
    public class Node{
        int data;
        Node next;

         Node(int d){
             data =d;
             next = null;

        }
    }

    public void insert(int data){
        Node new_node = new Node(data);

        if(head == null){
            head = new_node;
            return;
        }

        new_node.next = head;
        head = new_node;
    }

    public void printList(){
        Node read = head;
        while (read!=null){
            System.out.println(read.data+" ");
            read = read.next;
        }
    }

    public void sortEvenOdd(){
        Node es = null, en = null,os = null,oe = null;
        // here es = even start  en = even end  os = odd start oe = odd end;

        for(Node read = head; read !=null; read = read.next){
            int x = read.data;
            if(x%2==0){ // if data from node is even
                if(es==null){ // if es is null
                    es = read;  // add first even node to es
                    en = es; // keep track of en
                }
                else {
                    // this method is adding element to end and keeping track of end
                    en.next = read; // add next even node to en
                    en = en.next; // update even node to next node
                }
            }
            else {
                // similar of odd data
                if (os == null){
                    os = read;
                    oe = os;
                }
                else{
                    oe.next = read;
                    oe = oe.next;
                }
            }
        }
        if(os == null || es == null){
            return;
        }
        en.next = os; // merging two even odd list
        oe.next = null; // last node next is null
        head = es; // setting head
    }

    public static void main(String[] args) {
        segregateEvenOdd list = new segregateEvenOdd();
        list.insert(60);
        list.insert(53);
        list.insert(43);
        list.insert(33);
        list.insert(20);
        list.insert(10);

        list.sortEvenOdd();

        list.printList();


    }
}
