public class Node {
    private Node left;
    private Node right;
    private int data;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node(Node root, int data) {
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
    public void setLeft(Node node){
        this.left = node;
    }
    public void setRight(Node node){
        this.right = node;
    }

}
