class BST{
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;
    public BST(){

    }

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void Display(){
        Display(root, "Root Node: ");
    }

    private void Display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.getValue());

        Display(node.left, "Left child of " +node.getValue() +" : ");
        Display(node.right, "right child of " +node.getValue() +" : ");
    }

    
}