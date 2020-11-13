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
        if (isEmpty()) {
            System.out.println("stack is empty, Please add to stack");
            return -1;
        }
        else{
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
       
    }

    public void push(int value){
        if (isFull()) {
            System.out.println("stack is full, unable to add the value: "+ value);
            
        } else {
            top++;
        stackArray[top]= value;
        }
        

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
