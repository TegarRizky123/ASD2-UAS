package No3_BinaryTree;
public class BinaryTreeApp {
        public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        treenode node;
        
        node = new treenode(50);
        tree.insert(node);
        
        node = new treenode(30);
        tree.insert(node);
        
        node = new treenode(20);
        tree.insert(node);
        
        node = new treenode(40);
        tree.insert(node);
        
        node = new treenode(70);
        tree.insert(node);
        
        System.out.print("\nTraversal dengan inOrder: ");
        tree.inOrder();
        System.out.print("\nTraversal dengan preOrder: ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postOrder: ");
        tree.postOrder();
        System.out.print("\nTegar risqy yulian santoso");
    }
    
}
