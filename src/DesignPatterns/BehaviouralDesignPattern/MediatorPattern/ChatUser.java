package DesignPatterns.BehaviouralDesignPattern.MediatorPattern;

public class ChatUser extends User{
    public ChatUser(String name, ChatMediator chatMediator) {
        super(name, chatMediator);
    }

    @Override
    public void send(String message) {
        chatMediator.sendMessage(message,this);

    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " Received message : " + message);

    }
}
