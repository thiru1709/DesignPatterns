package DesignPatterns.BehaviouralDesignPattern.MomentoPattern;

import java.util.Stack;

public class Caretaker {

    private Stack<Momento> history = new Stack<>();

    public void save(TextEditor textEditor){
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor){
        if(history.empty()){
            System.out.println("No states to undo!");
        }
        textEditor.restore(history.pop());
    }
}
