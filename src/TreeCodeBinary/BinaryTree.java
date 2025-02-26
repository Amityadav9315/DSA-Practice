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
        System.out.println(node.data);

    }


}
