package LinkLIst;

public class doubleLinkList {
    static Node head;

    static  class Node{
        int data;
        Node prev;
        Node next;

        Node(int d){
            data = d;
            prev = null;
            next = null;
        }
    }

    public static void push_end(int data){
        Node new_node = new Node(data);
        Node last_node = head;

        while (last_node.next!= null){
            last_node = last_node.next;
        }
        last_node.next = new_node;// this is important
        new_node.prev = last_node;

    }

    public static void insertAfter(Node prev_node,int data){
        Node new_node = new Node(data);
        if(prev_node == null){
            System.out.println("This should not be empty");
        }

        new_node.next = prev_node.next;
        prev_node.next = new_node;
        new_node.prev = prev_node;

        if(new_node.next!= null){
            new_node.next.prev = new_node;
        }


    }

    public  static void push(int data){
        Node new_node = new Node(data);
        if(head==null){
            head = new_node;
            return;
        }

        new_node.next = head;
        head.prev = new_node;

        head = new_node;

    }


    public  static void printList(){
        Node read = head;
        System.out.println("List Items:");
        while (read!=null){
            System.out.println(read.data);
            read = read.next;
        }
    }

    public static void main(String[] args){
        doubleLinkList list = new doubleLinkList();



        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

       // list.push_end(5);


       // list.insertAfter(list.head.next,2); // pushing data between 40 and 30 as head points to 50

        list.reverse();

        list.printList();


    }

    public static void reverse() {
        Node temp = null;
        Node curr = head;

        if(head == null || head.next == null){
            curr = head;
        }

        while (curr!=null){

            // swaping next and prev of node
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev; // we have to traverse backward

        }

        head = temp.prev;

    }
}
