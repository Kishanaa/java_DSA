public class Reverse_linkedList {
    // head of the linked list
    Node head;

    private int size;
    Reverse_linkedList(){
        this.size=0;
    }
    //    Node
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }


    //    method to add a new node at the beginning of the linked list
    public void addFirst(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //    method to add a new node at the end of the linked list
    public void addLast(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //    print
    public void printList(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+ " -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

//    method to Reversing the linked list
    public void reverseIterate(){
        if (head==null || head.next==null){
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;
        while (currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

//            Update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public static void main(String[] args) {
        Reverse_linkedList list=new Reverse_linkedList();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();

        list.reverseIterate();
        list.printList();


    }
}
