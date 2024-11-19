public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public int getData(){return this.data;}
    public void setData(int val){this.data = val;}

}
