public class BST {
    private Node root;

    public BST(){
        root = null;
    }

    public void insert(int data){root = insertRec(this.root,data);}

        private Node insertRec(Node root,int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.getData()){
            root.setLeft(insertRec(root.getLeft(),data));
        } else if (data > root.getData()) {
            root.setRight(insertRec(root.getRight(),data));
        }
        return root;
    }

    public void inOrderTraversal(){
        System.out.println("In-order Traversal: ");
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node root){
        if(root != null){
            //LVR, Left -> Visit -> Right
            inOrderRec(root.getLeft());
            System.out.println(root.getData() + " ");
            inOrderRec(root.getRight());
        }
    }

}
