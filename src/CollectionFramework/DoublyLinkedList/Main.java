package CollectionFramework.DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.display();


        doubleLinkedList.addNode(3);
        doubleLinkedList.addNode(6);
        doubleLinkedList.addNode(9);
        doubleLinkedList.addNode(12);


        doubleLinkedList.display();


        doubleLinkedList.removeNode(9);
        doubleLinkedList.display();
    }
}
