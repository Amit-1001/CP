package LinkLIst;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class circularLinkedList {

    static class Node{
       int data;
       Node next;
       Node(int d){
           data= d;
           next = null;
       }
    }
    static  Node head;

    static void insert(int data){
        Node new_node = new Node(data);
        if(head == null){
               head = new_node;
               head.next = head;
        }else {
            Node curr = head;

            //below is naive approach
            while (curr.next!=head){
                curr = curr.next; // this will traverse to last node of linked list
            }
            curr.next = new_node; // last node will point to address of new_node
            new_node.next = head; // new_node will point to head

            // below is efficient solution
//            new_node.next = head.next;
//            head.next = new_node;
//            // here we are inserting element at beginning
//            // new_node inserted betn head.next element and head after head data and new node data is swapped
//            // this will make new_node as head
//            int temp = new_node.data;
//            new_node.data = head.data;
//            head.data = temp;

        }
    }

    static void insertAtEnd(int data){
        Node new_node = new Node(data);

        if(head == null){
            head = new_node;
            head.next = head;
        }

        Node curr =head;
        while (curr.next!=head){
            curr = curr.next;
        }

        curr.next = new_node;
        new_node.next = head;
    }

    static void insertAtBegin(int data){
        Node new_node = new Node(data);

        if(head == null){
            head = new_node;
            head.next = head;
        }
//        Node curr = head;
//        while (curr.next!=head){
//            curr = curr.next;
//        }
//
//        curr.next = new_node;
//        new_node.next = head;
//        head = new_node;
//

        // constant O(1) approach
         new_node.next = head.next;
        head.next = new_node;

        // swap head data and new_node data

        int temp = new_node.data;
        new_node.data = head.data;
        head.data = temp;


    }

    static void deleteHead(){
        if(head==null){
            System.out.println("List Is empty");
        }
        if(head.next == head){ // this condition for one node
            head =null;
            return;
        }

//        Node curr = head;
//
//        while (curr.next!=head){ // traversing till last node
//            curr  = curr.next;
//        }
//        curr.next = head.next; // last node will point to node which is next to head
//       head = head.next; // now head will become next node , result in deleting first node of linked list


        //efficient O(1) solution of delete head
        head.data = head.next.data; // we are copying data of node which next to head in head
        head.next = head.next.next; //  head will point to third node

    }

    static void printList(){
        Node temp;
        temp = head;
        if(head==null)return;
        System.out.print(temp.data+" ");
        for(Node r=temp.next;r!=head;r=r.next)
            System.out.print(r.data+" ");
    }

    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insertAtEnd(60);
        list.insertAtBegin(5); // while loop
        list.insertAtBegin(2); // swaping approach

        list.deleteHead(); // this will delete first node
        list.deleteHead();



        list.printList();
    }
}
