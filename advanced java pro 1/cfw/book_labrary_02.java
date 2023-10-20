/*in the program use Arraylist<> and Arraylist<> method like this add remove etc....
 * and create mini libarary */
package  cfw;

import java.util.ArrayList;
class Bookk {
    public String name;
    public String author;

    public Bookk(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String toString() {
        return name + " " + author;
    }
}
class library {

    public ArrayList<Book> books;

    public library(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book) {
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to) {
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b) {
        System.out.println("The book has been returned");
        this.books.add(b);
    }
}
public class book_labrary_02 {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithms", "CLRS\n");
        bk.add(b1);

        Book b2 = new Book("Algorithms2", "CLRS2\n");
        bk.add(b2);

        Book b3 = new Book("Algorithms3", "CLRS3\n");
        bk.add(b3);

        Book b4 = new Book("Algorithms4", "CLRS4\n");
        bk.add(b4);

        library l = new library(bk);
        l.addBook(new Book("algo4","myAuthor"));
        System.out.println(l.books);
        l.issueBook(b3, "Harry");
        System.out.println(l.books);
    }
}
