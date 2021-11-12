package Tree;

import java.awt.*;
import java.util.*;

public class BinaryTree {
    static Scanner in = new Scanner(System.in);

    public class Node{
        Node left;
        Node right;
         int data;
        Node(int data){
            this.data = data;
             left = null;
             right = null;

        }
    }


    public static void main(String[] args) {

        int ch;
       // Scanner in = new Scanner(System.in);
        BinaryTree obj = new BinaryTree();
        Node root =null;




        while (true){
            System.out.println("1.Insert in Binary Tree 2.Display Inorder 3.Display Preorder 4.Display Postorder 5.Print Height of Tree 6.Get Inorder Traversal in As List 7.Size of Binary Tree");
            System.out.println("Enter Choice:");
            ch = in.nextInt();
            switch (ch){
                case 1:
                    root = obj.createNode();
                    break;
                case 2:
                    System.out.println("Inorder of Tree :");
                    inorder(root);
                    break;
                case 3:
                    System.out.println("Preorder of Tree:");
                    preorder(root);
                    break;
                case 4:
                    System.out.println("Postorder of Tree:");
                    postorder(root);
                    break;

                case 5:
                    int height = printHeight(root);
                    System.out.println("Height of tree is :"+height);
                    break;

                case 6:
                    ArrayList<Integer> res;
                    res = getInorderTraversal(root);
                    System.out.println("Inorder As list:"+Arrays.toString(res.toArray()));
                    break;

                case 7:
                    System.out.println("Size of binary tree is :"+sizeOfTree(root));
                default:
                    System.out.println("Enter Valid choice");
            }
        }
    }

    private static int printHeight(Node root) {
        if(root == null){
            return 0;
        }
        // we visit node left and right recursively, we keep adding +1 for each recursive call
        // we return max
        return Math.max(printHeight(root.left),printHeight(root.right))+1;

    }


    private  Node createNode() {
        Node new_root;

        System.out.println("Enter Data:");
        int data = in.nextInt();

        if(data == -1){ // no data is entered when data is -1
            return null;
        }

        new_root = new Node(data);

        System.out.println("Enter left for:"+data);
        new_root.left = createNode();

        System.out.println("Enter right for:"+data);
        new_root.right = createNode();

        return new_root; // recursion will always get to first node
    }

    private static void inorder(Node root) {
        // left root right
        if (root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    private static void postorder(Node root) {
       //left right root
        // last node is always root
        if (root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }

    private static void preorder(Node root) {
        // root left right
        // first node is always root
        if(root!=null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }

    }

   public static void getInorderTraversalUtil(Node root, ArrayList<Integer> traversal) {
        if (root == null) {
            return;
        }
        // Inorder recursive calls
       // left root right
       // root will be added to traversal list
        getInorderTraversalUtil(root.left, traversal);
        traversal.add(root.data);
        getInorderTraversalUtil(root.right, traversal);

    }
    public static ArrayList<Integer> getInorderTraversal(Node root) {
        ArrayList<Integer> traversal = new ArrayList<Integer>(); // store result
        getInorderTraversalUtil(root, traversal);
        return traversal; // inorder result
    }


    public static int sizeOfTree(Node root){
        if(root == null){
            return 0;
        }
        else{
            return 1+(sizeOfTree(root.left)+sizeOfTree(root.right));
        }
    }

}
