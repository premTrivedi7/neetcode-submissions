class Node{
    String url;
    Node next;
    Node prev;
    public Node(String url){
        this.url = url;
        this.next = null;
        this.prev = null;
    }

}
class BrowserHistory {
    private Node head;
    private Node tail;
    private int size;
    private int k;
    public BrowserHistory(String homepage) {
        head = tail = new Node(homepage);
        size=1;
        k=0;
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

        Node temp = head;
        for(int i=1; i<=k; i++){
            temp = temp.next;
        }
        temp.next=tail;
        tail.prev = temp;
        
        k++;
        size=k+1;
    }
    
    public String back(int steps) {
        Node temp = head;
        for(int i=1; i<=k; i++){
            temp = temp.next;
        }
        while(steps!=0 && temp.prev!= null){
            temp = temp.prev;
            k--;
            steps--;
        }

        return temp.url;
    }
    
    public String forward(int steps) {
        Node temp = head;
        for(int i=1; i<=k; i++){
            temp = temp.next;
        }
        while(steps!=0 && temp.next!= null){
            temp = temp.next;
            k++;
            steps--;
        }

        return temp.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */