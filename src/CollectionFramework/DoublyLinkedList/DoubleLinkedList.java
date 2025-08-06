package CollectionFramework.DoublyLinkedList;

public class DoubleLinkedList<E> {

    private DoubleNode<E> head;


    public void addNode(E data){
        if(head == null){
            head = new DoubleNode<>(data);
            return;
        }else{
            DoubleNode<E> newNode = new DoubleNode<>(data);
            DoubleNode<E> currentNode = head;
            while (currentNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = newNode;
            newNode.prevNode = currentNode;
        }
    }


    public void display(){
        if(head == null){
            System.out.println("Double linked list is empty");
            return;
        }else{
            DoubleNode<E> currentNode = head;
            System.out.print("null <=> ");
            while(currentNode != null){
                System.out.print(currentNode + " <=> ");
                currentNode = currentNode.nextNode;
            }
            System.out.println("null");
        }
    }

    public void removeNode(E data){
        if(head == null){
            System.out.println("Double linked list is Empty");
            return;
        }
        if(head.getData() == data){
            DoubleNode<E> temp = head;
            head = temp.nextNode;
            head.prevNode = null;

        } else{
            DoubleNode<E> currentNode = head;
            while (currentNode != null && currentNode.nextNode.getData() != data){
                currentNode = currentNode.nextNode;
            }
            if(currentNode.nextNode == null){
                System.out.println("Element not found");
                return;
            }
            if(currentNode.nextNode.getData() == data){
                if(currentNode.nextNode != null){
                    currentNode.nextNode.prevNode = currentNode.prevNode;
                    currentNode.prevNode.nextNode = currentNode.nextNode;
                }

            }

        }
    }



}
