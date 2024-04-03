public class Linked_list {
    // head of the linked list
    Node head;

    private int size;
    Linked_list(){
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

//    delete first
    public void deleteFirst(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

//    delete last
    public void deleteLast(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }

        size--;
        if (head.next==null){
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
//    get Size
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Linked_list list=new Linked_list();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("bad");
        list.printList();
        list.deleteLast();
        list.printList();
//        list.deleteFirst();
//        list.printList();
        System.out.println(list.getSize());

    }
}
