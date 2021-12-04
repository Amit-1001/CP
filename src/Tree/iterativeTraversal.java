package Tree;

import java.util.Stack;

public class iterativeTraversal {
    public static void main(String[] args) {
        BT.Node root;

        BT t = new BT();
        root = t.createNode();


       inorder(root);
       // preorder(root);
        // postorder(root);
    }

    private static void inorder(BT.Node root) {


        BT.Node curr = root;
        Stack<BT.Node> st = new Stack<>();


            while (curr!=null || !st.isEmpty()){
                while (curr!=null){
                    st.push(curr);
                    curr = curr.left;  // going in left side of tree
                }
                curr = st.pop();
                System.out.print(curr.data+" ");
                curr = curr.right; // going to right side of tree
            }
    }
}
