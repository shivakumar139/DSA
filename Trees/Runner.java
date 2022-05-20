package Trees;

public class Runner {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add();
        System.out.println("Recursive In order traversal");
        tree.inOrderTraversal();
        tree.leftBoundary();

        System.out.println("\nIterative In order traversal");
        tree.iterativeInOrder();

//        System.out.println("\nIterative Pre order traversal");
//        tree.iterativePreOrder();
//
//        System.out.println("\nIterative Post order traversal");
//        tree.iterativePostOrder();
//        System.out.println("\nZig Zag Traversal");
//        tree.zigzagLevelOrder();

//        System.out.println("\nLevel Order Traversal");
//        tree.leverlOrderTraversal();

//        System.out.println("Reverse Leverl Order");
//        tree.reverse();
//        tree.leverlOrderTraversal();

//        System.out.println("\nPre Order Traversal");
//        tree.preOrderTraversal();
//
//        System.out.println("\nPost Order Traversal");
//        tree.postOrderTraversal();
//
//        System.out.println("\nNumber of leaf nodes");
//        System.out.println(tree.countLeafNodes());
//
//
//        BinaryTree newNode = new BinaryTree(10);
//        tree.levelOrderInsertion(newNode.root);
//        System.out.println("\nLevel Order Traversal");
//        tree.leverlOrderTraversal();
//
//        newNode = new BinaryTree(20);
//        tree.levelOrderInsertion(newNode.root);
//        System.out.println("\nLevel Order Traversal");
//        tree.leverlOrderTraversal();




    }
}
// 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1
