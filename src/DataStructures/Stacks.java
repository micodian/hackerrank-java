package DataStructures;

public class Stacks {

    private int maxSize;
    private int top;
    private long[] stackArray;


    public Stacks(int size){

        this.maxSize = size;
        this.top = -1;
        this.stackArray = new long[maxSize];

    }

    public long pop(){
        //....
        int old_top = top;
        top--;
        return stackArray[old_top];
    }

    public void push(int value){
        top++;
        stackArray[top]= value;

    }

    public long peek(){
        //.....
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == (maxSize - 1));
    }

    
}
