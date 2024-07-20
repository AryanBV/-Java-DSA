public class JavaBasics{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;

    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail= newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void removeNthNodeFromTheEnd(int n){
        int sz =0;
        Node temp = head;
        while(temp!= null){
            temp=temp.next;
            sz++;
        }
        if(sz==n){
            head = head.next;
            return;
        }
        int i =1;
        int iToFind= sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
    public static void main(String args[]){
        JavaBasics ll = new JavaBasics();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        ll.print();

        ll.removeNthNodeFromTheEnd(2);
        ll.print();
    }
}