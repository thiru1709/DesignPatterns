package DesignPatterns.BehaviouralDesignPattern.MomentoPattern;

public class TextEditor {

    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Momento save(){
        return new Momento(content);
    }

    public void restore(Momento momento){
        this.content = momento.getState();
    }


}
