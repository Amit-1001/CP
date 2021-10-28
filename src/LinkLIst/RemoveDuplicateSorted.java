package LinkLIst;

public class RemoveDuplicateSorted {
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void insertNode(int data){
        Node new_node = new Node(data);

        if(head == null){
            head = new_node;
            return;
        }

        new_node.next = head;
        head = new_node;
    }

    public  void printList(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

    public void removeDuplicate(){
        Node temp = head;


        while (temp.next != null &&temp!=null){
          if(temp.data == temp.next.data){
              temp.next = temp.next.next;
          }

              temp = temp.next;


        }



    }


    public static void main(String[] args) {
        RemoveDuplicateSorted list = new RemoveDuplicateSorted();

        list.insertNode(40);
        list.insertNode(30);
        list.insertNode(30);
        list.insertNode(20);
        list.insertNode(20);
        list.insertNode(10);


        list.printList();
        System.out.println();
        System.out.println("After removing Duplicate:");
        list.removeDuplicate();
        list.printList();


    }
}
