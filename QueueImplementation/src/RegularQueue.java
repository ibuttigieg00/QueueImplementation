public class RegularQueue extends Queues {

    public RegularQueue(int maxSizeIn){
        super(maxSizeIn);
    }

    /* Some notes for a non-circular queue
    To know that a queue is empty, the head is equal to the tail
    To know if this is the last element in the queue, the tail is
    equal to maxSize -1;
    In a queue, you insert at the tail (enqueue), and remove from the head (dequeue)
    since it follows the First In First Out.
    [0,1,2,3,4]
     */

    public boolean checkIfFull(){
        return (tail == maxSize);
    }

    public boolean checkIfEmpty(){
        return (head == tail);
    }

    public boolean Enqueue(int value){
        if(!checkIfFull()){
            if(checkIfEmpty()){
                head = 0;
                tail = 1;
                queue[head] = value;
                return true;
            }
            else {
                queue[tail] = value;
                tail ++;
            }
            return true;
        }
        else {
            return false;
        }
    }

    public boolean Dequeue(){
        if(checkIfEmpty()){
            return false;
        }

        queue[head] = 0;

        if(head == tail -1){
            head = 0;
            tail = 0;
        }
        else {
            head ++;
        }
        return true;
    }
}
