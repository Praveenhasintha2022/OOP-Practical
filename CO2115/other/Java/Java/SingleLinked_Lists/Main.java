

public class Main {
    
    public static void main(String[] args) {
        
        Single_Linked_List_2_Main list = new Single_Linked_List_2_Main();
        
        list.insertAtlast(4);
        list.insertAtlast(2);
        list.insertAtStart(5);
        list.insertAt(1, 24);
        list.insertAtlast(65);
        list.insertAtlast(3);
        list.insertAtStart(7);
        list.insertAtStart(8);
        list.insertAtlast(6);
        list.insertAt(4, 9);
        list.insertAtStart(10);
        list.insertAtStart(11);
        list.insertAt(3, 21);
        // 11 10 8 21 7 5 24 9 4 2 65 3 6
        // 13
        
        list.show();
        list.countNodes();
        
        list.deleteLast();
        list.deleteAt(4);
        list.deleteFirst();
        
        list.show();
        list.countNodes();
    }
    
}
