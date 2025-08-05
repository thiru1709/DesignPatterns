package DesignPatterns.BehaviouralDesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection{

    List<Channel> channelList = new ArrayList<>();
    @Override
    public void addChannel(Channel channel) {
        channelList.add(channel);

    }

    @Override
    public void removeChannel(Channel channel) {
        channelList.remove(channel);

    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, channelList);
    }
}
