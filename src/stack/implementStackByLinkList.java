package stack;

public class implementStackByLinkList {

    public class StackNode{
        int data;
        StackNode next;
        StackNode(int data){
            this.data = data;
            next = null;
        }
    }
    StackNode top;
    public void push(int data){
        StackNode new_node = new StackNode(data);
        new_node.next  = top;
        top = new_node;
    }

    public int pop(){
        if(top == null){
            return  -1;
        }

        StackNode temp = top;
        top = top.next;
        temp.next = null;

        return temp.data;
    }

    public static void main(String[] args) {
        implementStackByLinkList obj = new implementStackByLinkList();

        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }

}
