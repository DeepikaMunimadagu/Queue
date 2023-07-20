public class Queue {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class QueueB{
        static Node head;
        static Node tail;
        static int size;

        //isempty
        public static boolean isEmpty(){
            return (head==null || tail==null);
        }
        //add
        public static void add(int data){
            Node newNode = new Node(data);
            size++;
            if(isEmpty()){
                head=tail=newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        //remove
        public static void remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            else if(size==1){
                head=tail=null;
                size=0;
                System.out.println(head.data);
                return;
            }
            head = head.next;
            System.out.println(head);
        }

    }
}
