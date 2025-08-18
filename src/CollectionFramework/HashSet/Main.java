package CollectionFramework.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("one");

        System.out.println(hashSet.display());
    }
}
