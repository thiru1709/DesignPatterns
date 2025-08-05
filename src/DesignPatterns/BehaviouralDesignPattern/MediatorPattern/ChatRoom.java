package DesignPatterns.BehaviouralDesignPattern.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{

    private List<User> users = new ArrayList<>();
    @Override
    public void sendMessage(String message, User user) {
        for(User user1 : users){
            if(user != user1){
                user1.receive(message);
            }
        }

    }

    @Override
    public void addUser(User user) {
        users.add(user);

    }
}
