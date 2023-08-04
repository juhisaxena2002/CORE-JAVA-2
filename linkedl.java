class Node{
    int data;
    Node next;

    Node(){
        data = 0;
        next = null;
    }
    Node(int d, Node n){
        data = d;
        next = n;
    }

    public void setData(int d){
        data = d;
    }
    public void setNext(Node n){
        next = n;
    }
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }

}

class linkedlist{
    private int size;
    private Node start;
    public linkedlist(){
        size = 0;
        start = null;
        } 
    public Boolean isEmpty(){
        if(start == null){
            return true;
        }
        else{
            return false;
        }
    }

    public int getSize(){
        return size;
    }

    public void view_list(){
        Node t;
        if(isEmpty()){
            System.out.println(start.getData());
        }
        else{
            t = start;
            for(int i=0;i<=size;i++){
                System.out.println(" " + t.getData());
                t = t.getNext();
            }
        }
    }

    public void insertFirst(int val){
        Node n;
        n = new Node();
        n.setData(val);
        n.setNext(start);
        size++;
    }
}


public class linkedl {
    public static void main(String[] args) {
        
    }



}




