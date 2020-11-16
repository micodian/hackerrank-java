import DataStructures.CircularLinkedList;
import DataStructures.LinkedList;
import DataStructures.Node;

public class Main {

    
    public static void main(String[] args) {

        // Node nodeA = new Node(12);
        // Node nodeB = new Node(21);
        // Node nodeC = new Node(30);

        // nodeA.next = nodeB;
        // nodeB.next = nodeC;

        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(35);
        myList.insertFirst(350);
        myList.insertFirst(3500);
        myList.insertFirst(35000);
        myList.insertFirst(350000);


       myList.displayList();
       System.out.println();
       myList.displayLastInlist();
        
        
        

        // System.out.println();

    
    }

    // public static int listOfNodes(Node startNode){
    //     int count = 1;
    //     Node current = startNode;

    //     while (current.next != null) {
            
    //         current = current.next;
    //         count ++;
            
    //     }

    //     return count;

    // }
    
}
