class Node{
    int data;
    Node next;
}

class LL{
    Node head;
    Node tail;
    int size;

    void addLast(int val){
        if(size == 0){
        Node n = new Node();
        n.data = val;
        n.next = null;
        head = tail = n;
        size++;
        }
        else{
            Node n = new Node();
            n.data = val;
            n.next = null;
            tail.next = n;
            tail = n;
            size++;
            
        }
    }
    public int size(){
        return size;
    }

    public void display(){
        Node n = head;
        while(head!=null){
            System.out.print(n.data+ " ");
            n = n.next;
        }
        System.out.println();
    }

    public void remove_last(){
        if(size == 0){
            System.out.println("list is empty");
            size--;
        }
        else if(size == 1){
            head = tail = null;
            size = 0;
        }
        else{
            head = head.next;
            size--;

        }
    }
}


public class linkedlist2 {
    public static void main(String[] args) {
        
    }

}
