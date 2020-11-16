import DataStructures.LinkedList;
import DataStructures.Node;

public class Main {

    
    public static void main(String[] args) {

        // Node nodeA = new Node(12);
        // Node nodeB = new Node(21);
        // Node nodeC = new Node(30);

        // nodeA.next = nodeB;
        // nodeB.next = nodeC;

        LinkedList meList = new LinkedList();

        meList.insertFirst(100);
        meList.insertFirst(1001);
        meList.insertFirst(1002);
        meList.insertFirst(1003);

        meList.displayList();
        
        
        

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
