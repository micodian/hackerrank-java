import java.util.Arrays;

import DataStructures.Queue;
import DataStructures.Stacks;

public class Main  {

    
    public static void main(String[] args) {

        
       Queue myQueue = new Queue(5);
       myQueue.insert(32);
       myQueue.insert(35);
       myQueue.insert(399);
       myQueue.insert(35888);
       myQueue.insert(35888);

      
      System.out.println(myQueue.isFull()); 
      myQueue.insert(35888);

       

       
    }
    
}
