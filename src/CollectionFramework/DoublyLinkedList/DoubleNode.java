package CollectionFramework.DoublyLinkedList;

public class DoubleNode<E> {

    private E data;
    DoubleNode<E> prevNode;
    DoubleNode<E> nextNode;

    public DoubleNode(E data){
        this.data = data;
        this.prevNode = null;
        this.nextNode = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
