package CollectionFramework.Stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(4);
        stack.push(3);
        stack.push(7);

        stack.display();

        stack.pop();

        stack.display();

        int peek = stack.peek();

        stack.display();
    }
}
