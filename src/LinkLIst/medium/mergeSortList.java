package LinkLIst.medium;

import LinkLIst.LinkList;

import java.util.List;

public class mergeSortList {
    static LinkList.Node head;
    static class Node{
        int data;
        LinkList.Node next;
        Node(int d){
            data = d;
            next = null;

        }
    }

    public void push(int data){
        LinkList.Node new_node = new LinkList.Node(data);

        new_node.next = head;
        head = new_node;

    }

    public void append(int data){
        LinkList.Node new_node = new LinkList.Node(data); //this is creating new node

        if(head == null){
            head = new LinkList.Node(data);
            System.exit(0);
        }

        new_node.next = null;
        LinkList.Node last = head;

        while (last.next!=null){ // looping to last node
            last = last.next;
        }
        last.next = new_node;


    }

    public static void insertAfter(LinkList.Node prevNode, int data){
        LinkList.Node new_node = new LinkList.Node(data); // creating node for new data
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
        LinkList.Node read = head;

        while (read!=null){
            System.out.println(read.data);
            read = read.next;
        }
    }


    public LinkList.Node sortList(LinkList.Node head) {

        /**
         * Given the head of a linked list, return the list after sorting it in ascending order.
         * */
        if(head == null || head.next == null){
            return head;
        }

        // we are dividing linked list into two seperate linked list
        LinkList.Node mid = middleNode(head);
        LinkList.Node newHead = mid.next;
        mid.next = null;

        head = sortList(head); // sorting first half
        newHead = sortList(newHead); // sorting second half


        return mergeTwoList(head,newHead); // merging two sorted linked list




    }


    public LinkList.Node middleNode(LinkList.Node head){
        if(head == null)
            return null;
        LinkList.Node slow = head;
        LinkList.Node fast = head;

        while(fast.next != null &&  fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public LinkList.Node mergeTwoList(LinkList.Node list1, LinkList.Node list2){

        if(list1 == null || list2 == null) // checking edge case
            return list1 == null ? list2 : list1;


        LinkList.Node head = new LinkList.Node(-1); // to store sorted linked list we created sepearate linked list
        LinkList.Node prev = head;


        LinkList.Node one = list1;
        LinkList.Node two = list2;

        while(one != null && two != null){
            if(one.data < two.data){
                prev.next = one;
                prev = one;
                one = one.next;
            }
            else{
                prev.next = two;
                prev = two;
                two = two.next;
            }
        }
        if(one != null){
            prev.next = one;
        }
        if(two != null){
            prev.next = two;
        }

        return head.next;

    }


    public static void main(String[] args){
        mergeSortList list = new mergeSortList();
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
        System.out.println("Before sorting");
        list.printList();

        head = list.sortList(head); // returning new head
        System.out.println("After sorting");
        list.printList();





    }

}
