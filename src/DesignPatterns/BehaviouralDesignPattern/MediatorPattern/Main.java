package DesignPatterns.BehaviouralDesignPattern.MediatorPattern;

public class Main {


    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();

        User user1 = new ChatUser("Alice",chatMediator);
        chatMediator.addUser(user1);

        User user2 = new ChatUser("Bob", chatMediator);
        chatMediator.addUser(user2);

        User user3 = new ChatUser("Charlie", chatMediator);
        chatMediator.addUser(user3);

        user3.send("Hi Everyone");
    }
}
