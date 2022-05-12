package LinkedList;

public class SLL {
    private Node head;
    private Node tail;
    public int size;

    SLL(){
        this.size = 0;
    }

    class Node{
        private int data;
        private Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }




    // reverse using loops
    public void reverseLoops(){
        if(head == null || head.next == null){
            return;
        }

        Node prev = null;
        Node pres = head;
        Node next = head.next;


        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null)
                next = next.next;
        }

        Node temp = head;
        head = tail;
        tail = temp;



    }
    // reverse using recursion
    public void reverseRec(){
        if(head == null || head.next == null){
            return;
        }
        reverseHelper(head, head.next);

        head.next = null;
        Node temp = head;
        head = tail;
        tail = temp ;

    }

    private void reverseHelper(Node prev, Node tail){
        if(tail == null){
            return;
        }

        reverseHelper(tail, tail.next);
        tail.next = prev;


    }
    // bubble sort
    public void bubbleSort(){
        if(head == null || head.next == null){
            return;
        }
        Node node = head;
        while(node.next != null){
            Node nextNode = node.next;
            while (nextNode != null){
                if(node.data > nextNode.data){
                    int temp = node.data;
                    node.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }

            node = node.next;
        }
    }
    //insert using recursion
    public void insertRec(int val, int loc){
        Node node = new Node(val);


        // if list is empty
        if(head == null && loc == 0){
            head = node;
            tail = node;
            size++;
            return;
        }

        // if list is not null and location is 0
        if(loc == 0){
            insertFirst(val);
            return;
        }
        //if location is invalid
//        if(loc<0 || loc>size){
//            System.out.println("Invalid location");
//            return;
//        }
//
//        if(loc == size){
//            insertLast(val);;
//            return;
//        }
        Node temp = head;
        if(!helper(val, loc,temp)){
            System.out.println("Invalid Location");
        }
    }

    private boolean helper(int val, int i, Node temp){
        if(i==1){
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;
            size++;
            return true;
        }
        if(temp.next == null && i>1){
            return false;
        }
        if(temp.next != null)
            temp = temp.next;
        return helper(val, i-1, temp);
    }
    public void insertFirst(int val){
        Node node = new Node(val);

        // if list is empty
        if(tail == null){
            head = node;
            tail = head;
            size++;
            return;
        }


        // if list is not empty
        node.next = head;
        head = node;
        size++;
        return;
    }

    // display list
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    // Insert Last Position
    public void insertLast(int val){
        Node node = new Node(val);

        // if list is empty
        if(head == null){
            head = node;
            tail = head;
            size++;
            return;
        }

        // if list is not empty
        tail.next = node;
        tail = node;
        size++;
    }


    //Delete Last Position
    public int deleteLast(){
        // if list is empty
        if(head == null){
            System.out.println("List is empty!");
            return 0;
        }


        int val = tail.data;
        // if list has only one item
        if(head == tail){
            head = null;
            tail = null;
            size--;
            return val;
        }

        // if list is not empty
        // traverse till second last
        Node secondLast = head;
        for(int i=0; i<size-2; i++){
            secondLast = secondLast.next;
        }

        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }


    // insert at specific position
    public void insert(int val, int loc){
        Node node = new Node(val);

        // if list is empty and loc = 0
        if(head == null && loc == 0){
            insertFirst(val);
            return;
        }

        // if list is not empty and loc = 0
        if(head!=null && loc == 0){
            insertFirst(val);
            return;
        }

        // if loc == size it means value should be inserted at last
        if(loc == size){
            insertLast(val);
            return;
        }

        // if list is empty and loc > 0
        if((loc < 0 || loc >= size)){
            System.out.println("Invalid Location");
            return;
        }




        // if loc < size it means value should be inserted in between
        if(loc < size){

            // traverse till the loc - 1 position
            Node temp = head;
            for(int i=0; i<loc-1; i++){
                temp = temp.next;
            }

            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    // delete first
    public int deleteFirst(){

        // if list is empty
        if(head == null){
            System.out.println("List is empty");
            return -1;
        }

        int val;
        // if list has only one element
        if(head == tail){
            val = head.data;
            head = null;
            tail = null;
            size--;
            return val;
        }

        // if list has more than one elements

        val = head.data;
        head = head.next;
        size--;
        return val;
    }


    // delete at specific position
    public int delete(int loc){

        // if list is empty
        if(head == null){
            System.out.println("List is empty");
            return -1;
        }

        // if list is not empty and loc = 0
        if(head!=null && loc == 0){
            return deleteFirst();
        }


        // if loc >= size it means loc is out of scope
        if(loc < 0 || loc >= size){
            System.out.println("Location is out of scope");
            return -1;
        }


        // if list has only one element ans loc is 0
        if(head == tail && loc == 0){
            return deleteFirst();
        }


        int val = -1;
        // if loc is in the range and list is not empty
        if(loc < size){
            // traverse till the loc - 1 position
            Node temp = head;
            for(int i=0; i<loc-1; i++){
                temp = temp.next;
            }

            val = temp.next.data;
            temp.next = temp.next.next;
            size--;
        }
        return val;
    }

}















