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
    public void insertionSort(){
        for (int i = 1; i < queue.length; i++){
            int sortedPart = i - 1; //the first element in the list is the sorted part
            int key = queue[i];

            while(sortedPart >= 0 && queue[sortedPart] > key){
                queue[sortedPart + 1] = queue[sortedPart];
                sortedPart = sortedPart - 1;
            }

            queue[sortedPart + 1] = key;
        }
    }
    public void showQueue(){
        if(queue.length == 0){
            return;
        }
        for(int i = 0; i < queue.length; i++){
            if(i == queue.length -1){
                System.out.print(queue[i]);
                System.out.println();
                return;
            }
            System.out.print(queue[i] + ",");
        }
        System.out.println();
    }
}
