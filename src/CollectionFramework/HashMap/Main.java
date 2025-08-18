package CollectionFramework.HashMap;

public class Main {

    public static void main(String[] args) {
        SimpleHashMap<String,Integer> hashMap = new SimpleHashMap<>();

        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);


        System.out.println("Value for key two is " + hashMap.get("two"));

        hashMap.put("two",4);

        System.out.println("Value for key two is " + hashMap.get("two"));

        hashMap.remove("two");

        System.out.println("Value for key two is " + hashMap.get("two"));
    }
}
