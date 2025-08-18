package CollectionFramework.HashSet;

import java.util.HashMap;

public class HashSet<E> {

    private transient HashMap<E, Object> map;
    private static final Object PRESENT = new Object();

    public HashSet(){
        map = new HashMap<>();
    }

    public boolean add(E e){
        return map.put(e, PRESENT) == null;
    }

    public boolean remove(E e){
        return map.remove(e) == PRESENT;
    }

    public String display(){
        StringBuilder builder = new StringBuilder();
        for(E e: map.keySet()){
            builder.append(e.toString());
            builder.append(" ");
        }
        return builder.toString();
    }
}
