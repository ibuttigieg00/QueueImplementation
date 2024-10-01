public abstract class Queues {
    int [] queue;
    int maxSize;
    int head;
    int tail;

    public Queues(int maxSizeIn){
        queue = new int[maxSizeIn];
        maxSize = maxSizeIn;
        head = -1;
        tail = -1;  // when head = tail, means that the queue is empty
    }

    public abstract boolean checkIfFull();
    public abstract boolean checkIfEmpty();
    public abstract boolean Enqueue(int value); // enqueue at the tail
    public abstract boolean Dequeue(); // dequeue from the head
}
