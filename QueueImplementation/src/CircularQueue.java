public class CircularQueue extends Queues{

    public CircularQueue(int maxSizeIn){
        super(maxSizeIn);
    }

    public boolean checkIfFull() {
        return (tail + 1) % maxSize == head;
    }

    public boolean checkIfEmpty() {
        return head == -1;
    }


    public boolean Enqueue(int value) {
        if(!checkIfFull()){
            if (checkIfEmpty()) {
                // When queue is empty, both head and tail start at 0
                head = 0;
                tail = 0;
            }

            queue[tail] = value;
            // Move the tail pointer to the next position circularly
            tail = (tail + 1) % maxSize;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean Dequeue() {
        if(checkIfEmpty()){
            return false;
        }

        queue[head] = 0;
        // Check if this is the last element, if so, reset the queue
        if (head == tail) {
            head = -1;
            tail = -1;
        } else {
            // Move head circularly
            head = (head + 1) % maxSize;
        }
        return true;
    }
}
