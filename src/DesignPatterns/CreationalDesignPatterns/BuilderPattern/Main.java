package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class Main {

    public static void main(String[] args) {

        PostBuilder postBuilder = new PostBuilder();
        Post post = postBuilder.title("New Title").category("New Category").text("new Text").build();
        System.out.println(post.getTitle() + post.getCategory() + post.getText());

    }
}
