public class Main {
    public static void main (String [] args){
        RegularQueue queue = new RegularQueue(4);
        System.out.println(queue.Enqueue(5));
        System.out.println(queue.Enqueue(8));
        System.out.println(queue.Enqueue(1));
        System.out.println(queue.Enqueue(4));
        queue.insertionSort();
        queue.showQueue();
        System.out.println(queue.Dequeue());
        System.out.println(queue.Enqueue(4));
        CircularQueue circularQueue = new CircularQueue(3);
        circularQueue.Enqueue(2);
        circularQueue.Enqueue(3);
        circularQueue.Dequeue();
        circularQueue.Enqueue(3);
        circularQueue.Enqueue(4);
    }
}
