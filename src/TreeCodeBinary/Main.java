package TreeCodeBinary;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
              //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //tree banana start karte hai
        //creating root node
        Node root=new Node(1);
        //left chilf of root
        Node left=new Node(2);
        //right child of root
        Node right=new Node(3);

        BinaryTree binaryTree=new BinaryTree(root);


        binaryTree.root.left=left;
        binaryTree.root.right=right;






        }
    }
