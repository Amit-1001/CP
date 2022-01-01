package Tree.BST_Implementation;

import java.util.Scanner;

public class BSTOperations {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        BT.Node root =null;
        BT obj = new BT();
        while (true) {
            System.out.println("1:Create BST 2:Traverse Tree(Recursive)");

            int ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter data : Enter 0 to quite:");
                    int data = in.nextInt();
                    while (data!=0) {
                        root = obj.insert(root, data);
                        data = in.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("1:Inorder 2:Order");
                    int c = in.nextInt();
                    if (c == 1) {
                        System.out.println("Inorder of tree:");
                        inorder(root);
                        System.out.println();
                    }
                    if( c == 2){
                        System.out.println("Preorder of tree:");
                        preorder(root);
                        System.out.println();
                    }
                    if(c == 3){
                        System.out.println("Postorder");
                        postorder(root);
                        System.out.println();
                    }
            }
        }



    }

    private static void postorder(BT.Node root) {
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    private static void preorder(BT.Node root) {

        if(root != null){
            // root left right
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    private static void inorder (BT.Node root){
        if (root != null) {
            // left root right
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}
