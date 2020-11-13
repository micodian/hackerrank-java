package DataStructures;

public class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private long[] queueArray;
    private long count;

    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        this.count = 0;


    }

    public void insert(long value){

        if (isFull()) {
            System.out.println("The Queue is full, Please remove an item to add another one");
        } else {
        rear++;
        queueArray[rear]= value;
        count++;
        }
        
    }

    public long remove(){
        
        long temp = queueArray[front];
        front++;
        count --;
        return temp;
    }

    public long peek(){
        return queueArray[front];
    }

    public long peekRear(){
        return queueArray[rear];
    }

    public boolean isFull(){
        return (count == maxSize);
    }

    public boolean isEmpty(){
        return (count == 0);
    }

    public void printQueue(){
        System.out.print("[ ");
        for (int i = 0; i < count; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.print(" ]");
    }

}
