// Create an abstract Library class with borrow and returnItem methods, then use it in Book, Magazine, and EBook classes to implement these methods.

abstract class Library {
    abstract void borrow();
    abstract void returnItem();
}
class Book extends Library{
    void borrow(){
        System.out.println("borrow book");
    }
    void returnItem() {
        System.out.println("Returning a book...");
    }
}
class Magazine extends Library{
    void borrow(){
        System.out.println("borrow magazine");
    }
    void returnItem() {
        System.out.println("Returning a magazine...");
    }
}
class EBook extends Library{
    void borrow(){
        System.out.println("borrow E-book");
    }
    void returnItem() {
        System.out.println("Returning a ebook...");
    }
}

public class LibraryAbstract {
    public static void main(String[] args) {
        Book b = new Book();
        b.borrow();
    }
}
