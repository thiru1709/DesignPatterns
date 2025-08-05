package DesignPatterns.BehaviouralDesignPattern.IteratorPattern;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator{
    private final ChannelTypeEnum type;
    private final List<Channel> channelList;
    private int position;

    public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channelList){
        this.channelList = channelList;
        this.type = type;
    }

    @Override
    public boolean hasNext() {
        while(position < channelList.size()){
            Channel c = channelList.get(position);
            if(c.getType().equals(type) || type.equals(ChannelTypeEnum.ALL)){
                return true;
            }else{
                position++;
            }
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel c = channelList.get(position);
        position++;
        return c;
    }
}
