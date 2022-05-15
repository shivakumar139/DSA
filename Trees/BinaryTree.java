package Trees;

import java.util.*;

public class BinaryTree {
    Node root;
    public class Node {
        public int data;
        public Node left, right;

        Node(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }
        Node(){
            this.left = null;
            this.right = null;
        }
    }


    BinaryTree(int d){
        this.root = new Node(d);
    }
    BinaryTree(){
        this.root = null;
    }

    // InOrder Traversal [Left, Root, Right]
    public void inOrderTraversal(){
        inOrderTraversalhelper(this.root);
    }
    private void inOrderTraversalhelper(Node node){
//        if(node != null){
//            System.out.println(node.data);
//            helper(node.left);
//            helper(node.right);
//        }

        if(node == null){
            return;
        }

        // left nodes
        inOrderTraversalhelper(node.left);

        System.out.print(node.data + " ");

        // right nodes
        inOrderTraversalhelper(node.right);
    }



    public void add(){
        this.root = insertNodes();
        return;
    }
    private Node insertNodes(){
        System.out.println("Enter Data: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        if(val == -1){
            return null;
        }

        Node node = new Node(val);


        System.out.println("Enter left node of: " + val);
        // left node
        node.left = insertNodes();

        System.out.println("Enter right node of: " + val);
        //right
        node.right = insertNodes();

        return node;
    }


    // level order traversal
    public void leverlOrderTraversal(){
        Queue<Node> q = new LinkedList<>();
        q.add(this.root);
        q.add(null);

        while(!q.isEmpty()){
            Node temp = q.remove();
            if(temp == null){
//                System.out.print("#");
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                temp = q.remove();
                q.add(null);
            }
            System.out.print(temp.data + " ");


            if(temp.left != null){
                q.add(temp.left);
            }

            if(temp.right != null){
                q.add(temp.right);
            }

        }
    }

    // reverse level order

    public void reverse(){
        helperReverse(this.root);
    }

    private void helperReverse(Node node) {
        if(node == null){
            return;
        }

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        //left nodes
        helperReverse(node.left);
        // right nodes
        helperReverse(node.right);
    }


    // pre order traversal [Root, Left, Right]
    public void preOrderTraversal(){
        preOrderTraversalHelepr(this.root);
    }

    private void preOrderTraversalHelepr(Node node) {
        if(node == null){
            return;
        }

        System.out.print(node.data + " ");

        //left nodes
        preOrderTraversalHelepr(node.left);

        // right nodes
        preOrderTraversalHelepr(node.right);
    }


    // ppst order traversal [Left, Right, Root]
    public void postOrderTraversal(){
        postOrderTraversalHelepr(this.root);
    }

    private void postOrderTraversalHelepr(Node node) {
        if(node == null){
            return;
        }

        //left nodes
        postOrderTraversalHelepr(node.left);

        // right nodes
        postOrderTraversalHelepr(node.right);

        System.out.print(node.data + " ");
    }



    public int countLeafNodes(){
        return countLeafNodes(this.root);
    }
    // count the number of leaf nodes
    private int countLeafNodes(Node node){
        int count = 0;
        Queue<Node> q = new LinkedList<>();

        q.add(node);

        while(!q.isEmpty()){
            Node temp = q.remove();
            if(temp.left == null && temp.right == null){
                count++;
            }

            if(temp.left != null){
                q.add(temp.left);
            }

            if(temp.right != null){
                q.add(temp.right);
            }
        }

        return count;
    }


    // level order insertion
    public void levelOrderInsertion(Node newNode){
        Node node = this.root;
        Queue<Node> q = new LinkedList<>();

        q.add(node);

        while(!q.isEmpty()){
            Node temp = q.remove();
            if(temp.left == null && temp.right == null){
               temp.left = newNode;
               return;
            }

            if(temp.left != null){
                q.add(temp.left);
            } else{
                temp.left = newNode;
                return;
            }

            if(temp.right != null){
                q.add(temp.right);
            } else{
                temp.right = newNode;
                return;
            }
        }
    }

    // iterative in order traversal [Left, Root, Right]
    public void iterativeInOrder(){
        Node node = this.root;

        Stack<Node> stack = new Stack<>();
        stack.push(node);
        Node curr = node;
        while(!stack.isEmpty()){
            // while current is not empty keep going
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            Node peek = stack.pop();
            System.out.print(peek.data + " ");
            curr = peek.right;
        }
    }

    // zig zag traversal
    public void zigzagLevelOrder(){
        Node node = this.root;

        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node temp = q.remove();
            System.out.print(temp.data + " ");

            if(temp.right != null){
                q.add(temp.right);
            }
            if(temp.left != null){
                q.add(temp.left);
            }
        }
    }
}









