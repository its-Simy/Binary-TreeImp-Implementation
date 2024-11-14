public class Node {
    private Node left;
    private Node right;
    private int data;

    Node(Node root, int data) {
        if(root.data < data){
            root.right = new Node(root,data);
        }
        else{
            root.left = new Node(root,data);
        }
        root.left = null;
        root.right = null;
    }

    public int getData(){
        int num = -1000;
        if(this.right != null){
            num = this.data;
        }
        return num;
    }

    public Node getLeft(){
        return this.left;
    }

    public Node getRight(){
        return this.right;
    }

}
