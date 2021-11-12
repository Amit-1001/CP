package Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class printLeverOrder {
    static Scanner in =new Scanner(System.in);

    public class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            left =null;
            right = null;
            this.data = data;
        }
    }

    public void printLevel(Node root){
        if(root==null){
            return;
        }

        Queue<Node> q = new ArrayDeque<>();
        q.add(root); // push first root at queue
        while(!q.isEmpty()){
            Node curr = q.poll(); // peek first element which is first node in queue
            System.out.println(curr.data); // print data
            if(curr.left!=null){
                q.add(curr.left); // add left node in queue
            }
            if(curr.right!=null){
                q.add(curr.right); // add right node in queue
            }
        }


    }


    public Node createNode(){
        Node new_node;
        System.out.println("Enter data :");
        int data = in.nextInt();
        if(data==-1){
            return null;
        }

        new_node = new Node(data);

        System.out.println("Enter data for Left of:"+data);
        new_node.left = createNode();

        System.out.println("Enter data for right of:"+data);
        new_node.right = createNode();

        return new_node;
    }


    public static void main(String[] args) {
        printLeverOrder obj = new printLeverOrder();
        Node root =null;

        while (true){
            System.out.println("1.Create Tree 2.Print Level order of tree 3. Print level by level ");
            int ch = in.nextInt();

            switch (ch){
                case 1:
                    root = obj.createNode();
                    break;
                case 2:
                    obj.printLevel(root);
                    break;
                case 3:
                    obj.printLevelbylevel(root);
            }

        }
    }

    private void printLevelbylevel(Node root) {
            if(root == null){
                return;
            }

            Queue<Node> q = new ArrayDeque<>();

            q.add(root);

            while(q.isEmpty() == false){
                int count = q.size();

                for(int i = 0; i< count; i++){
                    Node curr  = q.poll(); // poll return and remove the front of queue

                    System.out.print(curr.data+" ");
                    if(curr.left!=null) {
                        q.add(curr.left);
                    }

                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
                System.out.println();
            }

    }

}
