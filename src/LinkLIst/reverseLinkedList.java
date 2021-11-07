package LinkLIst;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseLinkedList {
    static Node head;
   static class Node{
        Node next;
        int data;
        Node(int d){
            data =d;
            next = null;
        }
    }

    static void insert(int data){
        Node new_node = new Node(data);
         if(head== null){
             head = new_node;
             return;
         }

         new_node.next = head;
         head = new_node;
    }


    static void printList(){
        Node read = head;
        if (head == null){
            return;
        }

        while (read!=null){
            System.out.print(read.data+" ");
            read = read.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        reverseLinkedList list =new reverseLinkedList();

        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);

        list.printList();

       // naiveReverse();

       // System.out.println("After Reverse Linked list:");

       // list.printList();

        System.out.println("Efficient Solution:");
        efficientReverse();

        printList();
        int k = 2;

        //System.out.println("Reverse by group of :"+k);

       // list.reverseByK(k);

       // printList();


    }

     static void efficientReverse() {
        Node prev =null;
        Node next;
        Node curr = head;

        /// 40 , 30 , 20 , 10

        while (curr!=null){

            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head = prev; // this is important prev will have head;  //
   }

   static void reverseByK(int k){
       Node curr = head;
       Node prev;
       Node next;
       Node prevFirst = null; // previousFirst store first node(head) of group 'k'

       boolean isFirstPass = true;


       while(curr!=null) {
           Node first = curr; // first node of each pass
           prev = null;
           int count=0;
           while (curr != null && count < k) {
               // this loop will reverse node of group 'k'
               next = curr.next;
               curr.next = prev;

               prev = curr; // prev will be head of each group
               curr = next;

               count++;

           }
           if(isFirstPass){
               head = prev; // now after first pass the last kth node of first group will point to head which is prev
               isFirstPass = false;
           }
           else {
               // this else part join the reverse kth group to each other
               prevFirst.next = prev; // prev contain head of new pass(kth group)
               //preFirst is first node of (kth) group now it will point to new head
           }

           prevFirst = first; // now prevFirst will change to first node of next group of 'k'
           // first node of each group will be store at prevFirst before doing reverse

       }






   }

    static void naiveReverse() {
       Node read = head;

         ArrayList<Integer> arr = new ArrayList<>(); // auxilary array which store element

         while (read!=null){
             arr.add(read.data);
             read = read.next;

         }

         //putting element in reverse order in linked list
         read = head;

       for (int i = arr.size()-1;i>=0;i--){
           read.data = arr.get(i);
           read = read.next;
       }


    }
}
