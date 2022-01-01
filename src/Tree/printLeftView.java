package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class printLeftView {
int max =0;
    public static void main(String[] args) {
        printLeftView obj_1 = new printLeftView();

        BT obj = new BT();
        BT.Node root;


        root =obj.createNode();



        //obj_1.printLeft(root,1);


        System.out.println("\n=============== Iterative left view of Tree:========\n");
        obj_1.printleftIterative(root);


    }

    private void printleftIterative(BT.Node root) {
        if(root == null){
            return;
        }

        Queue<BT.Node> q = new LinkedList<>();
        q.add(root); // adding root to queue


        // this is same as printing Node level by level
        while(q.isEmpty() == false){
            int count = q.size();

            for(int i =0; i<count; i++){
                BT.Node curr = q.poll(); // poll return and remove front of queue
                if(i ==0){ // if there is only one node in queue then only print root data
                    System.out.print(curr.data+" ");

                }
                if(curr.left!=null){ // if left is not null add curr.left to queue
                    q.add(curr.left);
                }
                if(curr.right!=null){ // if right is not null add curr.right to queue
                    q.add(curr.right);
                }
            }

        }
    }

    public void printLeft(BT.Node root, int level){
        if (root == null ) {
            return;
        }

        // this is preorder traversal
        // we keep track of change in level of tree
        if(max<level){ // if level is greater which means we are on level of tree which is has to be left a
            System.out.print(root.data+" ");
            max = level;
        }

        printLeft(root.left,level+1); // new level always be at left
        printLeft(root.right,level+1);
    }
}
