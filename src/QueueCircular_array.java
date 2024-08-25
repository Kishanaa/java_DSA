public class QueueCircular_array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;
        Queue(int n){
            arr =new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //        enqueue
        public static void add(int data){

            if (front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //        dequeue
        public static int remove(){
            if (isEmpty()){
                System.out.println("queue is already empty");
                return -1;
            }
            int result=arr[front];
//            if there only single element
            if (rear==front){
                rear=front=-1;
            }else {
                front=(front+1)%size;
            }

            return result;
        }

        //        peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("queue is already empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue queue=new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.remove());
        queue.add(6);
        System.out.println(queue.remove());

        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
