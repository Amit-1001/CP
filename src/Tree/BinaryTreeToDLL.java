package Tree;

public class BinaryTreeToDLL {
    static DLL head;
    static DLL tail;
    public static class DLL{

        DLL prev;
        DLL next;
        int data;

        DLL(int data){
            this.data = data;
            prev = null;
            next = null;
        }
    }

    public static void main(String[] args) {
        BT t = new BT();
        BT.Node root;

        root = t.createNode();


            createDLL( root);


        displayLinkedList(head);



    }

    private static void displayLinkedList(DLL head) {

        DLL node = head;
        while(node!=null){
            System.out.print(node.data+"->");
            node = node.next;
        }


    }

    private static void createDLL(BT.Node root) {
        if(root != null){
            // using inorder traversal to store data in  linked list;
            createDLL(root.left);

            createLinkedList(root.data);

            createDLL(root.right);
        }






    }

    private static void createLinkedList(int data) {

        DLL new_node = new DLL(data);


        if(head == null){
            head = tail =  new_node;
        }
        else{

          tail.next = new_node;
          new_node.prev = tail;
          tail = new_node;

        }




    }
}
