public class Queue_linkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{

        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null & tail==null;
        }


        //        enqueue
        public static void add(int data){

            Node newNode=new Node(data);
            if (tail==null){
                tail=head=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        //        dequeue
        public static int remove(){
            if (isEmpty()) {
                System.out.println("queue is already empty");
                return -1;
            }
            int front= head.data;
            if (head==tail){
                tail=null;
            }
            head=head.next;
            return front;
        }

        //        peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("queue is already empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
