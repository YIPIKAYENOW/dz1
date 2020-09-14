package Book;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    public static void main(String[] args) {
        Book d1 = new Book(343, 29,1);
        Book d2 = new Book(420, 99,3);
        Book d3 = new Book(124,9,2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }

}