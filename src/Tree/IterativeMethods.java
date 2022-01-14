package Tree;

import java.util.Stack;

public class IterativeMethods {

    public static void main(String[] args) {
        BT t = new BT();
        BT.Node head = t.createNode();

        //Ipreorder(head);
       // Iinorder(head);

        Ipostorder(head);
    }

    private static void Ipostorder(BT.Node head) {
    // left right root
        Stack<BT.Node> st =new Stack<>();

       BT.Node temp;

        while(head!=null ||!st.isEmpty()){
            if(head!=null){
                st.push(head);
                head = head.left;
            }
            else { //left node is at left most node
                temp = st.pop();
                if(temp.data>0 && temp!=null){
                    temp.data = -temp.data; // if left most value is visited once make it negative
                    st.push(temp);
                    head = temp.right;
                }
                else{ // if left most value is visited
                    System.out.println(-1*temp.data);
                    temp = null;
                }

            }
        }
    }

    private static void Iinorder(BT.Node head) {
        // Traversal Order: Left Root Right
        Stack<BT.Node> st = new Stack<>();

        while (head!=null || !st.isEmpty()){
            if( head !=null){
                st.push(head);
                head = head.left;

            }
            else{ // left most node become null
                head = st.pop(); // Pop top of stack which is left most node of tree
                System.out.println(head.data+" "); // print left most node
                head = head.right; // go to right of head
            }

        }
    }

    private static void Ipreorder(BT.Node head) {
        // Traversal Order is Root left right
        Stack<BT.Node> st = new Stack<>();
        System.out.println("PreOder traversal:");
        while (head != null || !st.isEmpty()){
            if(head!=null){
                System.out.print(head.data+" "); // if head is not empty print it
                st.push(head); // push current node in stack
                head = head.left; // move to left side of tree

            }
            else{ // if left side of tree becomes empty move to right side of tree
                head = st.pop(); // pop top most element in stack and go to it's right side
                head = head.right;
            }
        }



    }
}
