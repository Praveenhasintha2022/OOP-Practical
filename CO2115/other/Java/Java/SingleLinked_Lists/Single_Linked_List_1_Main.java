

public class Single_Linked_List_1_Main {
    
    public static void main(String[] args) {
        //creating new nodes that are not connected together
        
        Nodes nodeA = new Nodes(6);
        Nodes nodeB = new Nodes(3);
        Nodes nodeC = new Nodes(4);
        Nodes nodeD = new Nodes(2);
        Nodes nodeE = new Nodes(1);
        
        //Connecting the nodes
        Nodes head = nodeA;
        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        
        //Printing nodes
        System.out.println("head node is " + head.data);
        System.out.println("second node is " + nodeB.data);
        System.out.println("third noed is " + nodeC.data);
        System.out.println("fourth node is " + nodeD.data);
        System.out.println("fifth node is " + nodeE.data);
        
        System.out.println("Number of nodes: " + countNodes(head));
    }
    
    private static int countNodes(Nodes head){
        int count = 0;
        Nodes currentNode = head;
        
        while(currentNode != null){
            count++;
            currentNode = currentNode.next;
        }
        
        return count;
    }
    
}
