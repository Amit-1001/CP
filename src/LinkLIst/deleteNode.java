package LinkLIst;

import java.util.List;
import java.util.SortedMap;

public class deleteNode {
    static Node head;
    // this class used create node
    static  class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static  void push(int data){
        Node new_node = new Node(data);

        new_node.next = head;
        head = new_node;
    }

    public static void del_atPos(int pos){
        Node temp = head;
        Node prev = null;
        if(head == null){
            return;
        }
        if(pos == 0){ // if we want to delete element at position 0
            head = temp.next;
            return;
        }

//        for(int i = 0 ; temp!=null && i < pos;i++){ // this will loop till we get node at given position
//            prev = temp; // storing previous node of given position
//            temp = temp.next; // this is node which points to given position
//        }

        for(int i =0; i< pos -2;i++){ // pos -2 will point to previous node of pos
            temp = temp.next;
        }
        temp.next = temp.next.next; // now previous node will point next pos node

      //  prev.next = temp.next; //
    }

    public  static void del_node(int data){
        Node temp = head, prev = null; // pre = null is important here

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == data) {
            head = temp.next; // Changed head

        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != data) {
            prev = temp; // this will store previous node before moving to new node
            temp = temp.next;
        }

        //you can even use
//        while(temp.next.next!=null){if 10 20 30 are nodes it will point to node 20 as next of next is NULL
//            temp = temp.next;
//        }
        // temp.next = null this will delete end node




        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;



    }



    public static void printList(){
        Node read_node = head;
        System.out.println("Data in LinkedList");
        while (read_node!=null){
            System.out.println(read_node.data);
            read_node = read_node.next;
        }
    }




    public static  void main(String[] args){
        deleteNode list = new deleteNode();

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(60);

        //list.del_node(20); // deleting node

       // list.del_atPos(1); // deleting element at position 1

        list.del_atPos(2);

        list.printList();
    }
}
