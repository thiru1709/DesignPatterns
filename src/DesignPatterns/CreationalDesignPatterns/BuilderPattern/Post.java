package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class Post {

    private final String title;
    private final String text;
    private final String category;

    public Post(PostBuilder postBuilder){
        this.text = postBuilder.text;
        this.title = postBuilder.title;
        this.category = postBuilder.category;
    }

    public String getTitle(){
        return title;
    }

    public String getText(){
        return text;
    }

    public String getCategory(){
        return category;
    }
}
