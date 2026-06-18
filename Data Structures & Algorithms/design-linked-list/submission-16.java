class Node{
    int val;
    Node next;
   
    public Node(int val){
        this.val = val;
        this.next = null;
        
    }
}



class MyLinkedList {
        private Node head;
        private Node tail;
        private int size;

    public MyLinkedList() {
        Node node = new Node(0);
         this.head = node;
         this.tail = node;
         this.size = 0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        Node temp = head;
        
        for(int i=1; i<=index; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(size==0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }

        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(size==0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return ;
        Node newNode = new Node(val);
        Node temp = head;
        Node prev = head;
        if(index==0){
            addAtHead(val);
            return;
        }
        for(int i=1; i<=index; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = newNode;
        newNode.next = temp;
if(index == size) tail = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return ;
        Node temp = head;
        Node prev = head;
        if(index==0){
            head = head.next;
            size--;
            if(size == 0) tail = head;
            return;
        }
        
        for(int i=1; i<=index; i++){
            prev = temp;
            temp = temp.next;
        }
        
        
        
        prev.next = temp.next;
        if(index == size - 1) tail = prev;
        
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */