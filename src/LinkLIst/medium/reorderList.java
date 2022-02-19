package LinkLIst.medium;



public class reorderList {
    static reorderList.Node head;
    static class Node{
        int data;
        reorderList.Node next;
        Node(int d){
            data = d;
            next = null;

        }
    }

    public void push(int data){
       reorderList.Node new_node = new reorderList.Node(data);

        new_node.next = head;
        head = new_node;

    }

    public void append(int data){
        reorderList.Node new_node = new reorderList.Node(data); //this is creating new node

        if(head == null){
            head = new reorderList.Node(data);
            System.exit(0);
        }

        new_node.next = null;
        reorderList.Node last = head;

        while (last.next!=null){ // looping to last node
            last = last.next;
        }
        last.next = new_node;


    }

    public static void insertAfter(reorderList.Node prevNode, int data){
        reorderList.Node new_node = new reorderList.Node(data); // creating node for new data
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
        reorderList.Node read = head;

        while (read!=null){
            System.out.println(read.data);
            read = read.next;
        }
    }

    public void reorderList(reorderList.Node head) {

        /**
         * You are given the head of a singly linked-list. The list can be represented as:
         *
         * L0 → L1 → … → Ln - 1 → Ln
         * Reorder the list to be on the following form:
         *
         * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
         * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
         *
         * **/
        if(head == null){ // base case
            return;
        }

        // step 1 (Find mid of linked list and break it in two seperate linked list)
        reorderList.Node mid = findMid(head); // finding mid
        reorderList.Node newHead = mid.next; // second half
        mid.next = null; // breaking first half


        // step 2 reverse the second half of linked list
        reorderList.Node revNewHead = reverse(newHead);

        //step 3 rearrage the two sepearate linked list in order given in problem
        // rearrange
        reorderList.Node dummy1 = head;
        reorderList.Node dummy2 = revNewHead;

        while(dummy1!= null && dummy2!=null){
            // storing next node of each linked list
            reorderList.Node s1 = dummy1.next;
            reorderList.Node s2 = dummy2.next;

            // arranging pattern given in problem
            dummy1.next = dummy2;
            dummy2.next = s1;

            //moving to new node
            dummy1 = s1;
            dummy2 = s2;
        }



    }

    public reorderList.Node findMid(Node head){

        if(head ==null || head.next == null){ // base case
            return head;
        }

        reorderList.Node slow = head;
        reorderList.Node fast = head;

        while(fast.next!=null && fast.next.next != null){ // considering left side mid
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public reorderList.Node reverse(reorderList.Node newHead){
        if(newHead == null || newHead.next == null){
            return newHead;
        }

        reorderList.Node prev = null;
        reorderList.Node curr = newHead;

        while(curr!= null){
            reorderList.Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev; // newHead of reversed linked list
    }

    public static void main(String[] args){
        reorderList list = new reorderList();
        //int afterLink = 20; // this is where we want to insert data
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);



        //int data = 11; // data we want to insert after 20

//        Node locating_node = list.head; // this is head of list
//        while (locating_node.data!=20){
//            locating_node = locating_node.next; // this location of afterLink
//        }

        //insertAfter(locating_node,data); // passing node
        System.out.println("Before");
        list.printList();

        System.out.println("After rearrangement");
        list.reorderList(head);

        list.printList();

    }
}
