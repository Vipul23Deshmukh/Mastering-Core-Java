package Collection_Framework.HashSet;

import java.util.HashSet;

public class HashSet_Basic {
    public static void main(String[] args) {
        HashSet<String> books=new HashSet<String>();
        books.add("To Kill a Mockingbird");
        books.add("The Alchemist");
        books.add("The Great Gatsby");
        books.add("Dune");
        System.out.println(books);
        books.contains("Dune");
        books.remove("The Great Gatsby");
        books.size();
        System.out.println(books);


    }
}
