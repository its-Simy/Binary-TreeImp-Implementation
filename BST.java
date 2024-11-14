public class BST {
    Node root;
    BST(){
        root = null;
    }
    public boolean insert(int val){
        if(root == null){//means that the tree hasn't been constructed yet
            root = new Node(root,val);
        }
        else{
            Node current = root;
            boolean add = false;
            while(!add){
                if(current.getData() < val){
                    current = current.getRight();
                }
                else{
                    current = current.getLeft();
                    if(current.getLeft() == null){
                        
                    }
                }

            }
        }
    }


}
