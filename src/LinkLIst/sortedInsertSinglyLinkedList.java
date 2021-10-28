package LinkLIst;

public class sortedInsertSinglyLinkedList {
    static Node head;
    static class  Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }

    }
    static void sortedInsert(int data){
        Node new_node = new Node(data);

        if(head == null){
            head = new_node;
            return;
        }
        if(data< head.data){
            new_node.next= head;
            head = new_node;
            return;
        }

        Node curr = head;
        while (curr.next !=null && curr.next.data<data){
            curr = curr.next;
        }
        new_node.next = curr.next;
        curr.next = new_node;

    }

    static void  insert(int data){
        Node new_node = new Node(data);

        if(head == null){
            head = new_node;
            return;
        }

        new_node.next = head;
        head = new_node;
    }

    static void printList(){
        if(head == null){
            System.out.println("Linked List is empty");
            System.exit(0);
        }

        Node curr = head;
        while (curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
    }

    static void printMiddle(){
        Node slow = head, fast = head;

        if(head == null){
            return;
        }

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next; // here fast is moving with 2 node gap
        }
        System.out.println("Middle element is "+slow.data);
    }

    static void printNth(int pos){
        if(head == null){
            return;
        }
        int count = 0;
        Node curr = head;

        // method 1
//        while (curr!=null){
//            curr = curr.next;
//            count++;
//        }
//        curr= head;
//        System.out.println("size of list:"+count);
//        int new_pos = (count - pos)+1;
//
//        for (int i = 1; i<new_pos;i++){
//            curr = curr.next;
//        }
//        System.out.println("Element from last at pos:"+pos+"is:"+curr.data);

        // below is two point approach

        Node slow=head,fast =head;
        for(int i =0; i <pos;i++){
            if(fast == null){
                return;
            }
            fast = fast.next; // fast will point to pos from front
        }

        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println("Element from last at pos:"+pos+"is:"+slow.data);

    }




    public static void main(String[] args) {
        sortedInsertSinglyLinkedList list = new sortedInsertSinglyLinkedList();

        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);

        list.sortedInsert(25);
        //list.sortedInsert(35);
        //list.sortedInsert(5);
        //list.sortedInsert(45);



        list.printList();

        list.printMiddle();
        list.printNth(2);
    }
}
