/* URL : https://leetcode.com/problems/design-circular-queue/description/ */
class MyCircularQueue {
    int[] queue;
    int front;
    int rear;
    int size;
    int frontnl; //no limit of array size
    int rearnl; //no limit of array size
    public MyCircularQueue(int k) {
        size = k;
        queue = new int[size];
        front = -1;
        frontnl = front;
        rear = -1;
        rearnl = rear;
    }
    
    public boolean enQueue(int value) {
        if(rear == -1) {
            queue[++rear] = value;
            front++;
            frontnl = front;
            rearnl = rear;
            return true;
        } else if(isFull()) return false;
        rearnl++;
        rear = rearnl % size;
        queue[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        frontnl++;
        front = frontnl % size;
        return true;
    }
    
    public int Front() {
        return (isEmpty()) ? -1 : queue[front];
    }
    
    public int Rear() {
        return (isEmpty()) ? -1 : queue[rear];
    }
    
    public boolean isEmpty() {
        return (frontnl > rearnl || front == -1);
    }
    
    public boolean isFull() {
        return (isEmpty()) ? false : (size == Math.abs(frontnl - rearnl)+1);
    }
}
