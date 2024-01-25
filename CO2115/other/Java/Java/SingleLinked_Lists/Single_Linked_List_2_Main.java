

public class Single_Linked_List_2_Main { //5
    
    Nodes head;
    
    public void insertAtStart(int data){ //5, null
        Nodes newNode = new Nodes(data);
        
        if(head == null)
            head = newNode;
        else{
            newNode.next = head; // 5, head
            head = newNode;
        }
    }
    
    public void insertAtlast(int data){
        Nodes newNode = new Nodes(data);
        
        if(head == null)
            head = newNode;
        else{
            Nodes current = head;
            
            while(current.next != null)
                current = current.next;
            
            current.next = newNode;
        }
    }
    
    public void insertAt(int index, int data){
        Nodes newNode = new Nodes(data); //65, null
        
        if(index == 0)
            insertAtStart(data);
        else{
            Nodes current = head; //20
            
            for(int i=0; i<index-1; i++) //0; 0<1
                current = current.next; //5
            
            newNode.next = current.next; //65, 20, 78
            current.next = newNode; // 5, 65, 20, 78
        }
    }
    
    public void deleteFirst(){
        Nodes current = head;
        head = current.next;
        
        // or
        // head = head.next;
    }
    
    public void deleteLast(){
        Nodes current = head;
        
        while(current.next.next != null)
            current = current.next;
        
        current.next = null;
    }
    
    public void deleteAt(int index){
        if(index == 0)
            head = head.next;
        else{
            Nodes current = head;
            Nodes temp = null;
            
            for(int i=0; i<index-1; i++)
                current = current.next;
            
            temp = current.next;
            current.next = temp.next;
            
            System.out.println("Deleted element is "+temp.data);
        }
    }
    
    public void countNodes(){
        int count=0;
        Nodes current = head;
        
        while(current != null){
            count++;
            current = current.next;
        }
        
        System.out.println("Number of nodes in list: "+count);
        System.out.println();
    }
    
    public void show(){
        Nodes current = head;
        
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        
        System.out.println();
    }
    
}
