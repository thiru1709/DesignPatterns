package DesignPatterns.CreationalDesignPatterns.Prototype;

public class Shape implements Prototype{

    private final String type;

    public Shape(String type){
        this.type = type;

    }

    public String getType(){
        return type;
    }

    @Override
    public Prototype clone() {
        return new Shape(this.type);
    }
}
