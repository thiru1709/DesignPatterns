package CollectionFramework.LinkedList;

public class LinkedList<E> {
    private Node<E> head;


    public void addNode(E data){
        Node<E> newNode = new Node<>(data);

        if(head == null){
            head = newNode;
        }else {
            Node<E> current = head;
            while(current.getNextNode() != null){
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
    }


    public void display(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        else{
            Node<E> currentNode = head;
            while (currentNode != null){
                System.out.print(currentNode.getData() + " -> ");
                currentNode = currentNode.getNextNode();
            }
            System.out.println("null");
        }
    }


    public void removeNode(E data){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        if(head.getData() == data){
            head = head.getNextNode();
            return;
        }
        else{
            Node<E> currentNode = head;
            while (currentNode.getNextNode() != null && currentNode.getNextNode().getData() != data){
                currentNode =currentNode.getNextNode();
            }
            if(currentNode.getNextNode() == null){
                System.out.println("Element not found");
                return;
            }
            if(currentNode.getNextNode().getData() == data){
                currentNode.setNextNode(currentNode.getNextNode().getNextNode());
            }
        }
    }
}
