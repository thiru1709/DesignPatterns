package DesignPatterns.BehaviouralDesignPattern.MomentoPattern;

public class MomentoPatternExample {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        textEditor.setContent("Version 1");
        caretaker.save(textEditor);

        textEditor.setContent("Version 2");
        caretaker.save(textEditor);

        textEditor.setContent("Version 3");
        System.out.println("Current content " + textEditor.getContent());

        caretaker.undo(textEditor);

        System.out.println("After undo " + textEditor.getContent());

        caretaker.undo(textEditor);

        System.out.println("After undo " + textEditor.getContent());
    }
}
