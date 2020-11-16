import DataStructures.Node;

public class Main {

    
    public static void main(String[] args) {

        Node nodeA = new Node(12);
        Node nodeB = new Node(21);
        Node nodeC = new Node(30);

        nodeA.next = nodeB;
        nodeB.next = nodeC;


        System.out.println(listOfNodes(nodeB));

    
    }

    public static int listOfNodes(Node startNode){
        int count = 1;
        Node current = startNode;

        while (current.next != null) {
            
            current = current.next;
            count ++;
            
        }

        return count;

    }
    
}
