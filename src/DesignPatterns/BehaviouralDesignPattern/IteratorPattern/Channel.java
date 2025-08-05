package DesignPatterns.BehaviouralDesignPattern.IteratorPattern;

public class Channel {

    private double frequency;
    private ChannelTypeEnum type;

    public Channel(double frequency, ChannelTypeEnum type){
        this.frequency = frequency;
        this.type = type;
    }

    public double getFrequency(){
        return frequency;
    }

    public ChannelTypeEnum getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", type=" + type +
                '}';
    }
}
