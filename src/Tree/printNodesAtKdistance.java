package Tree;

import java.util.Scanner;

public class printNodesAtKdistance {


    Scanner in = new Scanner(System.in);

    public class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            left = null;
            right = null;
            this.data = data;
        }
    }

    public Node createNode(){
        System.out.println("Enter Data:");
        int data = in.nextInt();

        Node new_node;

        if(data == -1){
            return null;
        }

        new_node = new Node(data);

        System.out.println("Enter left data for :"+data);
        new_node.left = createNode();

        System.out.println("Enter right data for :"+data);
        new_node.right = createNode();


        return new_node;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printNodesAtKdistance obj = new printNodesAtKdistance();
        Node root = null;

        while (true) {
            System.out.println("1.Create Node 2.find Nodes at k positions");

            int ch = in.nextInt();

            switch (ch){
                case 1:
                    root = obj.createNode();
                    break;

                case 2:
                    System.out.println("Enter position:");
                    int k = in.nextInt();
                    obj.findPos(root,k);

            }

        }

    }

    private void findPos(Node root, int k) {
        if(root == null){
            return;
        }

        if(k == 0){
            System.out.println(root.data+" "); // if k is zero return data
        }
        else {
            findPos(root.left, k - 1);// recursively call left till k become zero
            findPos(root.right, k - 1); // recursively call right till k becomes zero
        }
    }
}