package LinkLIst;

public class deleteEntireList {
    static Node head;
    static class  Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void del_list(){
        head = null; // this will delete entire linked list
        // automatic garbage collection will deal deleted link list;
    }

    public static void push(int data){
        Node new_node = new Node(data);

        new_node.next = head;
        head = new_node;
    }

    public void printList(){
        Node read = head;
        while (read!=null){
            System.out.println(read.data);
            read = read.next;
        }
    }



    public static void main(String[] args){
        deleteEntireList list = new deleteEntireList();

        list.push(10);

        list.push(20);
        list.push(30);
        list.push(40);
list.printList();

    list.del_list();
        System.out.println("List Deleted:");




    }


}
