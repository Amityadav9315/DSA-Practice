package TreeCodeBinary;

public class BinaryTree {
    Node root;


    public BinaryTree(Node root){

        this.root=root;
    }
    public BinaryTree(){
        this.root=null;
    }

    //DFS
    //Preorder-->Root-->Left-->Right
    public  void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+"\t");

        preOrder(node.left);
        preOrder(node.right);

    }
    //Inorder-->Left-->Root-->Right
    public  void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+"\t");
        inOrder(node.right);

    }
    //Postorder-->Left-->Root-->Right

    public  void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.right);
        postOrder(node.left);
        System.out.print(node.data+"\t");
    }






}
