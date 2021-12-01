package Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class maxWidthOfTree {
    public static void main(String[] args) {
        BT t = new BT();
        BT.Node root;
        root =  t.createNode();

        if(root == null){
            System.out.println("Maximum width of tree is :0");
        }

        int res  = maxWidth(root);

        System.out.println("Maximum width of tree is:"+res);
    }

    private static int maxWidth(BT.Node root) {
        if(root == null){
            return 0;
        }

        Queue<BT.Node> q = new ArrayDeque<>();

        q.add(root);

        int max =0;
        while (!q.isEmpty()){
            int count = q.size(); // size of level
            max = Math.max(max,count); // taking maximum width of tree

            for(int i=0; i<count;i++){ // looping through all root on level and adding them in queue
                BT.Node curr = q.poll();

                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right !=null){
                    q.add(curr.right);
                }
            }


        }
        return max;
    }
}
