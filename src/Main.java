import DataStructures.Stacks;

public class Main  {

    
    public static void main(String[] args) {

        
       
        Stacks myStack = new Stacks(10);
        myStack.push(12);
        myStack.push(13);
        myStack.push(34);
        myStack.push(54);
        myStack.push(87);
        myStack.push(47);

        // while (!myStack.isEmpty()) {
        //     long value = myStack.pop();
        //     System.out.println(value);
        // }

        System.out.println(myStack.isFull());

        System.out.println(myStack.peek());

        
    }
    
}
