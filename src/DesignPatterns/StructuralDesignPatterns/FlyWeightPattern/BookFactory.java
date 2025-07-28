package DesignPatterns.StructuralDesignPatterns.FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {

    private final Map<String,Book> bookCache = new HashMap<>();

    public Book getBook(String title,String author,String isbn ){
        String key = title + "_" + author + "_" + isbn;
        if(!bookCache.containsKey(key)){
            bookCache.put(key, new BookImpl(title,author,isbn));
            System.out.println("Creating a new book entry in cache");
        }else{
            System.out.println("Reusing exisitng Book entry");
        }
        return bookCache.get(key);
    }
}
