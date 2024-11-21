public class Main {
    public static void main(String[] args) {

        BST binarySearchTree = new BST();

        //insert elements into the BST
        binarySearchTree.insert(50);
        binarySearchTree.insert(30);
        binarySearchTree.insert(70);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);

        //perform in-order traversal
        binarySearchTree.inOrderTraversal();

        //perform pre-order traversal
        binarySearchTree.preOrderTraversal();

        //perform post-order traversal
        binarySearchTree.postOrderTraversal();

        //search for an element
        System.out.println("Search for 40: " + binarySearchTree.search(40));
        System.out.println("Search for 100: " + binarySearchTree.search(100));

        //delete an element
        System.out.println("Deleting 50...");
        binarySearchTree.delete(50);





    }


}
