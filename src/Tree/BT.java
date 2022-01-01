package Tree;

import java.util.Scanner;

public class  BT {
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

    public Node createNode(){
        Node new_node;
        System.out.println("Enter Data:");
        int data;
        data = in.nextInt();

        if(data == -1){
            return null;
        }

        new_node = new Node(data);

        System.out.println("Enter left data for:"+data);
        new_node.left = createNode();

        System.out.println("Enter right data for:"+data);
        new_node.right = createNode();

        return new_node;
    }
}
