package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class PostBuilder {

    public String title;
    public String text;
    public String category;

    public PostBuilder title(String title){
        this.title = title;
        return this;
    }

    public PostBuilder text(String text){
        this.text = text;
        return this;
    }

    public PostBuilder category(String category){
        this.category = category;
        return this;
    }

    public Post build(){
        return new Post(this);
    }
}
