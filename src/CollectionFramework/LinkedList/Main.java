package CollectionFramework.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.display();

        linkedList.addNode(3);
        linkedList.addNode(6);
        linkedList.addNode(9);
        linkedList.addNode(12);


        linkedList.display();


        linkedList.removeNode(9);
        linkedList.display();


        linkedList.removeNode(12);
        linkedList.display();


        linkedList.removeNode(3);
        linkedList.display();

        linkedList.removeNode(6);
        linkedList.display();
    }
}
