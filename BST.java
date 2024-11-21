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

    public void preOrderTraversal(){
        System.out.println("Pre-order Traversal: ");
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(Node root){
        if(root != null){
            //VLR , Visit -> Left -> Right
            System.out.println(root.getData() + " ");
            preOrderRec(root.getLeft());
            preOrderRec(root.getRight());
        }
    }

    //Post-Order traversal of the BST
    public void postOrderTraversal(){
        System.out.println("Post-order Traversal: ");
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(Node root){
        //LVR Left -> Right -> Visit
        if(root != null){
            postOrderRec(root.getLeft());
            postOrderRec(root.getRight());
            System.out.println(root.getData() + " ");
        }
    }

    //Search for a value in the BST
    public boolean search(int data){return searchRec(root,data);}

    private boolean searchRec(Node root,int data) {
        if (root == null) {
            return false;
        }
        if (root.getData() == data) {
            return true;
        }
        //Inline if statement, whatever is before the ? is the actual statement for the if statement
        // : indicates what is done for else statement
        return data < root.getData() ? searchRec(root.getLeft(), data): searchRec(root.getRight(), data);
    }

    //delete a node from the BST
    public void delete(int data){root = deleteRec(root,data);}

    private Node deleteRec(Node root,int data) {
        if (root == null) {
            return root;
        }
        if(data < root.getData()){
            root.setLeft(deleteRec(root.getLeft(),data));
        } else if (data > root.getData()) {
            root.setRight(deleteRec(root.getRight(),data));
        }
       else{
           //Node with only one child or no child
           if (root.getLeft() == null){
               return root.getRight();
           }
           else if (root.getRight() == null){
               return root.getLeft();
           }
        }
       //Node with two children: Get the inorder successor(smallest in the right subtree)
        root.setData(findMin(root.getRight()));
       //Delete the inorder successor
        root.setRight(deleteRec(root.getRight(),root.getData()));

        return root;

    }

    private int findMin(Node root){
        int minValue = root.getData();
        while(root.getLeft() != null){
            root = root.getLeft();
            minValue = root.getData();
        }
        return minValue;
    }


}
