package LinkLIst;

import java.util.List;

public class LinkList {
   static Node head;
    public static class Node{
        public int data;
        public Node next;
        public Node(int d){
          data = d;
          next = null;

        }
    }

    public void push(int data){
        Node new_node = new Node(data);

        new_node.next = head;
        head = new_node;

    }

    public void append(int data){
        Node new_node = new Node(data); //this is creating new node

        if(head == null){
            head = new Node(data);
            System.exit(0);
        }

        new_node.next = null;
        Node last = head;

        while (last.next!=null){ // looping to last node
            last = last.next;
        }
        last.next = new_node;


    }

    public static void insertAfter(Node prevNode, int data){
        Node new_node = new Node(data); // creating node for new data
        if(prevNode == null){
            System.out.println("Node should not be empty");
        }

        new_node.next = prevNode.next;
        prevNode.next = new_node;


        // if pos is given then
//        int pos = 2;
//        Node temp = head;
//
//        for(int i =1 ; temp!=null && i <=pos -2 ; i++){ // here we are taking - 2 cause each node as address of next node in it
//            temp = temp.next;
//            // 10 20 30  if we want to insert at position 3  then it will point node 2 as 3 - 2 = 1
//            // as next of 10 is 20
//        }
//        new_node.next = temp.next
        // temp.next = new_node
        // this will insert element between node 10 and 20

    }

    public void printList(){
        Node read = head;

        while (read!=null){
            System.out.println(read.data);
            read = read.next;
        }
    }

    public static void main(String[] args){
        LinkList list = new LinkList();
        //int afterLink = 20; // this is where we want to insert data
        list.push(10);
        list.push(20);
        list.push(30);

        list.append(40);

        //int data = 11; // data we want to insert after 20

//        Node locating_node = list.head; // this is head of list
//        while (locating_node.data!=20){
//            locating_node = locating_node.next; // this location of afterLink
//        }

        //insertAfter(locating_node,data); // passing node

        list.printList();

    }
}
