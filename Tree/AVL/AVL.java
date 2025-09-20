public class AVL{
    public class Node{
        private final int value;
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
    public AVL(){

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

    private void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        // return node;
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            // left left case
            if(height(node.left.left)-height(node.left.right)>0){
                return rightRotate(node);
            }
            //left right case
            if(height(node.left.left)-height(node.left.right)<0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
            
        }

        if(height(node.left)-height(node.right)<-1){
            // right right case
            if(height(node.right.left)-height(node.right.right)<0){
                return leftRotate(node);
            }
            //right left case
            if(height(node.right.left)-height(node.right.right)>0){
                node.right = rightRotate(node.left);
                return leftRotate(node);
            }
            
        }
        return node;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;

        p.height = 1+ Math.max(height(p.left), height(p.right));
        c.height = 1+ Math.max(height(c.left), height(c.right));
        return c;
    }
    
    private Node leftRotate(Node c){
        Node p = c.right ; 
        Node t = p.left;
        p.left = c;
        c.right = t;

        p.height = 1+ Math.max(height(p.left), height(p.right));
        c.height = 1+ Math.max(height(c.left), height(c.right));
        return p;
    }


    public void populate(int[] nums){
        for(int i =0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    public void populatedSorted(int[] nums){
        populatedSorted(nums, 0, nums.length-1);
    }

    private void populatedSorted(int[] nums, int start, int end){
        if(start > end){
            return;
        }

        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populatedSorted(nums, start, mid - 1);
        populatedSorted(nums, mid + 1, end);
    }
        


    public boolean balnaced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(this.root, "Root Node: ");
        
    }
    private void display(Node node, String details){
        if(node == null){
            return;

        }
        System.out.println(details+node.value);
        display(node.left, "Left child of "+ node.value + " : ");
        display(node.right, "Right child of "+ node.value + " : ");
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        AVL avl = new AVL();
        int[] nums = {10,20,30,40,50,25};
        avl.populate(nums);
        avl.display();


    }
}