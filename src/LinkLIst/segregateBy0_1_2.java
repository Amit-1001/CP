package LinkLIst;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class segregateBy0_1_2 {
    Node head;
    public class Node{
        Node next;

        int data;
        Node(int data){
            this.data = data;
            next = null;

        }
    }


    public void insert(int data){
        Node new_node = new Node(data);

        new_node.next = head;
        head = new_node;
    }

    public void printLinkedList(){
        Node read = head;
        while (read!=null){
            System.out.print(read.data+" ");
            read = read.next;
        }
    }

    public void segregateLinkedList(){
        Node zeroD = new Node(0);
        Node oneD = new Node(0);
        Node twoD = new Node(0);

        Node zero = zeroD, one = oneD, two = twoD;

        Node curr = head;
        while (curr!=null){
            if(curr.data == 0){
                zero.next = curr;
                zero = zero.next;
               curr = curr.next;
            }
            else if(curr.data == 1){
                one.next = curr;
                one = one.next;
                curr = curr.next;
            }
            else {
                two.next = curr;
                two = two.next;
                curr = curr.next;
            }
        }

        zero.next = (oneD.next!=null) ? oneD.next:twoD.next;
        one.next = twoD.next;
        two.next = null;

        head = zeroD.next;
    }



    public static void main(String[] args) {
        segregateBy0_1_2 obj = new segregateBy0_1_2();

        obj.insert(1);
        obj.insert(2);
        obj.insert(0);
        obj.insert(2);
        obj.insert(1);

        System.out.println("Before sorting:");
        obj.printLinkedList();

        obj.segregateLinkedList();
        System.out.println("After sorting:");
        obj.printLinkedList();
    }
}
