package Tree.BST_Implementation;

import java.util.Scanner;

public class BT {
    static Scanner in = new Scanner(System.in);
    public  class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        public Node insert(Node root, int data){

            if (root == null){
                root = new Node(data);
            }

            else if(data < root.data){
                root.left = insert(root.left,data);
            }
            else if(data > root.data)
            {
                root.right = insert(root.right,data);
            }

            return  root;
        }
    }

